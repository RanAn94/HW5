<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recommendation for Movies</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <div class="wrap">
            <!--Header-->
            <%@ include file="includes/header.jsp"%>
            <!--Menu-->
            <%@ include file="includes/menu.jsp"%>
        <div class="main">
        <h1>Recommendation for Movies</h1>
        <a href="read">View All Movies</a>
        <br><br>
        <a href="search.jsp">Search Movies</a>
        </div>
        <!--Footer-->
        <%@ include file="includes/footer.jsp"%>
        </div>
    </body>
</html>
