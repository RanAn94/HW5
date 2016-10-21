<%-- 
    Document   : add
    Created on : Oct 20, 2016, 11:38:25 PM
    Author     : Ran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Movie</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <h1>Add A New Movie</h1>
        
        <form name="addForm" action="addMovie" method="get">
            
            <label>Movie Name:</label>
            <input type="text" name="mname" value=""/>
            <br>
        
            <label>Director Name:</label>
            <input type="text" name="dname" value=""/>
            <br>
        
            <label>Publish Year:</label>
            <input type="text" name="year" value=""/>
            <br>
        
            <label>Movie Type:</label>
            <input type="text" name="type" value=""/>
            <br>
            
            <input type="submit" name="submit" value="Submit"/>
        </form>
        
    </body>
</html>
