
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Movies;

public class ReadQuery 
{
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery()
    {
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead()
    {
        try {
            String query = "Select * from movies";
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLTable()
    {
        String table ="";        
        try {
            while(this.results.next())
            {
                Movies movie = new Movies();
                movie.setMovieID(this.results.getInt("movieID"));
                movie.setMovieName(this.results.getString("movieName"));
                movie.setDirectorName(this.results.getString("directorName"));
                movie.setPublishYear(this.results.getInt("publishYear"));
                movie.setMovieType(this.results.getString("movieType"));
                
                table += "<tr>";
                table += "<td>";
                table += movie.getMovieID();
                table += "</td>"; 
                
                table += "<td>";
                table += movie.getMovieName();                     
                table += "</td>";
                
                table += "<td>";
                table += movie.getDirectorName();                     
                table += "</td>";
                
                table += "<td>";
                table += movie.getPublishYear();                     
                table += "</td>";
                
                table += "<td>";
                table += movie.getMovieType();                     
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?movieID="+movie.getMovieID()+"> Update</a>"+"<a href=delete?movieID="+movie.getMovieID()+"> Delete</a>";
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        table += "</table>";
            return table;   
    }
}
