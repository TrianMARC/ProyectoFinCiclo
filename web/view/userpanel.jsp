<%-- 
    Document   : index
    Created on : 04-may-2016, 19:41:23
    Author     : victo
--%>

<%@page import="Model.Voter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //Opening new session
    HttpSession ses = request.getSession(true);
    if(ses.getAttribute("user") ==null){
        response.sendRedirect("../index.jsp");
    }else{
        Voter user = (Voter)ses.getAttribute("user");
%>
<%@include file="header.jsp" %>
        <section class="main">
            <div class="login">
                <h2 class="section_title">User dashboard</h2>
                <ul class="dashboard">
                    <% if(!user.isVoted()){ %>
                    <a href="#"><li class="enabled"><span class="flaticon-agreement"></span><strong>Vote</strong></li></a>
                    <li class="disabled"><span class="flaticon-network "></span><strong>Cense</strong></li>
                    <li class="disabled"><span class="flaticon-presentation"></span><strong>Results</strong></li>
                    <a href="#" ><li class="enabled"><span class="flaticon-contract"></span><strong>Dismiss</strong></li></a>  
                    <% }else{%>
                    <li class="disabled"><span class="flaticon-agreement"></span><strong>Vote</strong></li>
                    <a href="#"><li class="enabled"><span class="flaticon-network "></span><strong>Cense</strong></li></a>
                    <a href="#"><li class="enabled"><span class="flaticon-presentation"></span><strong>Results</strong></li></a>
                    <li class="disabled"><span class="flaticon-contract"></span><strong>Dismiss</strong></li>
                    <%}%>
            </div>
        </section>
        <section class="second">
            <span></span>
        </section>
<%@include file="footer.jsp" %>
<% } %>