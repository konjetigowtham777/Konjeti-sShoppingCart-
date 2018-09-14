<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body style="background-color:#c8f6f1;">

<b>Home Page</b>

<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="resources/images/one.jpg" alt="first slide" height="50%" width="50%">
                    <div class="container">
                        <div class="carousel-caption">
                            <h2>WELCOME TO THE HEALTHY WORLD OF BRITANNAI</h2>                            
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="resources/images/two.jpg" alt="Second slide" height="50%" width="50%">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>HEALTHY PRODUCTS FOR AN HELTHY HUMANS</h1>                           
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img  src="resources/images/three.jpg" alt="Third slide" height="10%" width="30%">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>SANDLEWOOD PRODUCTS FOR AN HEALTHY SKIN</h1>                            
                        </div>
                    </div>
                </div>
                 <div class="item">
                    <img class="img-responsive" src="resources/images/four.jpg" alt="forth slide" height="50%" width="50%">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>TRUSTED PRODUCT FOR AN HEALTHY TEETH</h1>                            
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" ></span>
                <span class="sr-only">Next</span>
            </a>
        </div><!-- /.carousel -->

</div>

</body>
</html>