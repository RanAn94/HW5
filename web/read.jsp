<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movies Recommended</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    
    
    
    <body>
        
    <div class="wrap">
            <!--Header-->
            <%@ include file="includes/header.jsp"%>
            <!--Menu-->
            <%@ include file="includes/menu.jsp"%>
       
            <div class="main">
                <h1>Movies Recommended</h1>
                    <div style="overflow-x:auto;">
                        <table>
                            <tr>
                                <th> MovieID </th>
                                <th> Movie Name </th>
                                <th> Director Name </th>
                                <th> Publish Year </th>
                                <th> Movie Type </th>
                                <th>Delete</th>
                            </tr>
                            <%= table %>
                        </table>
                    </div>
                    <br><br>
                    <a href ="add">Add A New Movie</a>
                    <br><br>
                    <a href="search.jsp">Search Movies</a>
            </div>
        
        <!--Footer-->
        <%@ include file="includes/footer.jsp"%>
    </div>
    </body>
</html>
