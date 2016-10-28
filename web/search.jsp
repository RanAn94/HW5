<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Movies</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <div class="wrap">
            <!--Header-->
            <%@ include file="includes/header.jsp"%>
            <!--Menu-->
            <%@ include file="includes/menu.jsp"%>
            <div class="main">
                <h1>Search Movies</h1>
                    <form name="searchForm" action="search"method="get">
                    <input type="text" name="searchVal" value=""/>
                    <br>       
                    <input type="submit" name="submit"value="Search"/>
                    </form>
            </div>
        <!--Footer-->
        <%@ include file="includes/footer.jsp"%>
        </div>
    </body>
</html>
