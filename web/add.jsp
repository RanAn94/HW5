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
            <table class="add">
            <tr>
                <td><label>Movie Name:</label></td>
                <td><input type="text" name="mname" value=""/></td>
            </tr>
        
            <tr>
                <td><label>Director Name:</label></td>
                <td><input type="text" name="dname" value=""/></td>
            </tr>
        
            <tr>
                <td><label>Publish Year:</label></td>
                <td><input type="text" name="year" value=""/></td>
            </tr>
        
            <tr>
                <td><label>Movie Type:</label></td>
                <td><input type="text" name="type" value=""/></td>
            </tr>
            
            <tr>
            <td><input type="submit" name="submit" value="Submit"/></td>
            <td><input type="reset" value="Clear" id="clear"></td>
            </tr>
            </table>
        </form>
        
    </body>
</html>
