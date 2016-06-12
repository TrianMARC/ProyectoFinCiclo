<%-- 
    Document   : cense
    Created on : 04-jun-2016, 15:07:50
    Author     : Usuario
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Voter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="header.jsp" %>

  <%  //Opening new session
   
    if (ses.getAttribute("user") == null) {
        response.sendRedirect("../index.jsp");
    } else {
        Voter user = (Voter) ses.getAttribute("user");
        ArrayList<Voter> voters = (ArrayList<Voter>) ses.getAttribute("voters");
        int countpage=0;
        int nextpage=1;
%>

<section class="main">
    <div class="login">
        <h2 class="section_title">Registered users</h2>

        <table class="doctable">
            <thead>
                <th>DNI</th>
                <th>Name</th>
                <th>Surname</th>
                <th class="td-mail">E-mail</th>
                <th>Voted</th>
            </thead>
            
            
            <% for(Voter v : voters){ %>
            <% if(countpage%10==0 && countpage > 1){ nextpage++; } %>
            <tr class="nextpage<%=nextpage %> classrow" >
                <td><%=v.getDNI()  %></td>
                <td><%=v.getName()  %></td>
                <td><%=v.getSurname()  %></td>
                <td class="td-mail"><%=v.getEmail()  %></td>
                <td><% if(v.isVoted()){ %> <input type="checkbox" checked disabled> <% }else{ %><input type="checkbox" disabled> <% } %></td>
                
            </tr>
            <%  countpage++; } %>
            
        </table>
        
            <section id="pagination" style="text-align: center">
                            
            <% for(int i=1; i<=nextpage; i++){ %>
            
            <button onclick="show(<%=i %>)"><%=i %></button>
            
            <%
            }    
            %>
                      
                        </section>
    </div>
</section>

<section class="second">
    <span></span>
</section>
            <script type="text/javascript" src="../js/pagination.js"></script>
            <script>
            show(1);
            </script>
<%@include file="footer.jsp" %>
<% }%>
