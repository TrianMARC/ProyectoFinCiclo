<%-- 
    Document   : header.jsp
    Created on : 23-may-2016, 16:23:25
    Author     : victo
--%>

<%@page import="model.Voter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Final Project - Elections</title>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href="../css/style.css" />
        <link rel="stylesheet" type="text/css" href="../css/icons.css" />
        <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="../js/responsive.js"></script>
       
    </head>
    <% HttpSession ses = request.getSession(true); 
    Voter usercheck= (Voter)ses.getAttribute("user");
    String welcome = usercheck != null ? usercheck.getName()+" "+usercheck.getSurname() : "anonymous";
    %>
    <body>
        <header>
            <h1>e-lections</h1>
            <div class="menu_bar">
			<a href="#" class="bt-menu"><span class="icon-menu"></span>Menu</a>
            </div>
            <nav id="menu">
                <ul>
                    <li><a href="../index.jsp"><span class="icon-home"></span> Home</a></li>
                    <li><a href="#"><span class="icon-pushpin"></span> FAQ</a></li>
                    <li><a href="../javadoc/index.html"><span class="icon-books"></span> Documentation</a></li>
                    <li><a href="aboutus.jsp"><span class="icon-users"></span> About Us</a></li>
                    <% if(usercheck!=null){ %>  <li><a href="../Dispatcher?action=LogOut"><span class="icon-users"></span> Log Out</a></li> <% } %>
                </ul>
                <span>Welcome <%=welcome%>!</span>
            </nav>
        </header>
