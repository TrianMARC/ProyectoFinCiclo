<%-- 
    Document   : index
    Created on : 04-may-2016, 19:41:23
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<% 
String error = (String)ses.getAttribute("error"); %>

        <section class="main">
            <div class="login">
                <h2 class="section_title" style="color:red;">ERROR!</h2>
                <center style="font-weight:bold;padding:20px;"><%=error%></center>
                <center style="margin-bottom:10px;"><a class="formButt" onclick="history.go(-1)" href="#">Go back</a></center>
            </div>
        </section>
        <section class="second">
            <span></span>
        </section>
<%@include file="footer.jsp" %>
