<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Movies"%>
<%Movies movie = (Movies) request.getAttribute("movie");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update the Movie</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <h1>Update the Movie</h1>
        
        <form name="updateForm" action="updateMovie" method="get">
            <table class="update">
                
            <tr>
                <td><label>Movie ID:</label></td>
                <td><input type="text" name="movieID" value="<%=movie.getMovieID()%>" readonly/></td>
            </tr>
            
            <tr>
                <td><label>Movie Name:</label></td>
                <td><input type="text" name="mname" value="<%=movie.getMovieName()%>"/></td>
            </tr>

            <tr>
                <td><label>Director Name:</label></td>
                <td><input type="text" name="dname" value="<%=movie.getDirectorName()%>"/></td>
            </tr>
        
            <tr>
                <td><label>Publish Year:</label></td>
                <td><input type="text" name="year" value="<%=movie.getPublishYear()%>"/></td>
            </tr>
            
            <tr>
                <td><label>Movie Type:</label></td>
                <td><input type="text" name="type" value="<%=movie.getMovieType()%>"/></td>
            </tr>
            
            <tr>
                <td><input type="submit" name="submit" value="Update"/></td>
                <td><input type="reset" value="Clear" id="clear"></td>
            </tr>
            </table>
        </form>
    </body>
</html>
