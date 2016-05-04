<%-- 
    Document   : index
    Created on : 04-may-2016, 19:41:23
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Final Project - Elections</title>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link rel="stylesheet" type="text/css" href="css/icons.css" />
        <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/responsive.js"></script>
    </head>
    <body>
        <header>
            <h1>e-lections</h1>
            <div class="menu_bar">
			<a href="#" class="bt-menu"><span class="icon-menu"></span>Menu</a>
            </div>
            <nav id="menu">
                <ul>
                    <li><a href="#"><span class="icon-home"></span> Home</a></li>
                    <li><a href="#"><span class="icon-pushpin"></span> FAQ</a></li>
                    <li><a href="#"><span class="icon-books"></span> Documentation</a></li>
                    <li><a href="#"><span class="icon-users"></span> About Us</a></li>
                </ul>
                <span>Welcome anonymous!</span>
            </nav>
        <section class="main">
            <div class="login">
                
                <form action="#" method="post" class="eform"> 
                    <h2>User Panel</h2>
                    <label>
                        <input type="text" placeholder="DNI/NIF" />
                    </label>
                    <label>
                        <input type="text" placeholder="PASSWORD" />
                    </label>
                    <input type="submit" value="Sign In" class="formButt" /> <a class="formButt" href="#">Sign Up</a>
                </form>
            </div>
        </section>
        <section class="second">
            <span></span>
        </section>
        <footer>
            <span>Designed and developed by Víctor Sánchez del Río & Jose Manuel Saéz López</span><br/>
            <span>I.E.S. "Leonardo Da Vinci" - Albacete 2015/2016</span>
        </footer>
    </body>
</html>
