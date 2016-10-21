
package model;

public class Movies
{
    private int movieID;
    private String movieName;
    private String directorName;
    private int publishYear;
    private String movieType;
    
    public Movies() 
    {
        this.movieID = 0;
        this.movieName = "";
        this.directorName = "";
        this.publishYear = 0;
        this.movieType = "";
    }

    public Movies(int movieID, String movieName, String directorName, int publishYear, String movieType) 
    {
        this.movieID = movieID;
        this.movieName = movieName;
        this.directorName = directorName;
        this.publishYear = publishYear;
        this.movieType = movieType;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    @Override
    public String toString() {
        return "Movies{" + "movieID=" + movieID + ", movieName=" + movieName + ", directorName=" + directorName + ", publishYear=" + publishYear + ", movieType=" + movieType + '}';
    }
    
    
    
}
