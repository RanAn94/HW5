
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

   public class ReadRecord
{
    private Connection conn;
    private ResultSet results;
    
    private Movies movie = new Movies();
    private int movieID;
    
    public ReadRecord(int movieID)
    {
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
    
    this.movieID = movieID;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead()
    {
        try {
            String query = "SELECT * FROM movies WHERE movieID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1,movieID);
            
            this.results = ps.executeQuery();
            this.results.next();
            
            movie.setMovieID(this.results.getInt("movieID"));
            movie.setMovieName(this.results.getString("movieName"));
            movie.setDirectorName(this.results.getString("directorName"));
            movie.setPublishYear(this.results.getInt("publishYear"));
            movie.setMovieType(this.results.getString("movieType"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

   }    
    
    public Movies getMovie()
    {
    return this.movie;    
    }
}
    
    