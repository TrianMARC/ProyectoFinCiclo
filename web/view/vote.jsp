<%-- 
    Document   : index
    Created on : 04-may-2016, 19:41:23
    Author     : victo
--%>

<%@page import="Model.Political_party"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Voter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //Opening new session
    HttpSession ses = request.getSession();
    if(ses.getAttribute("user") ==null){
        response.sendRedirect("../index.jsp");
    }else{
        Voter user = (Voter)ses.getAttribute("user");
        ArrayList<Political_party> politicalParties = (ArrayList<Political_party>) ses.getAttribute("politicalParties");
%>
<%@include file="header.jsp" %>
        <section class="main">
            <div class="login">
                <h2 class="section_title">Vote one political party</h2>
                <form action="../Dispatcher" method="post">
                    
                <% int cont = 0, items = 0;
                for(Political_party p : politicalParties){ %>
                    
                    <% if(cont==0){ %>
                        <div style="float:left;margin-left: 10px; margin-right: 10px;"><table>
                    <% } %>
                    <tr>
                        <td><input type="radio" value="<%=items %>" name="politicalParty" /></td>
                        <td><img width="50" height="50" src="../img/parties/<%=p.getLogo()%>" title="<%=p.getName()%>" alt="<%=p.getName()%>" /></td>
                        <td><%=p.getName() %></td>
                    </tr>
                <%
                    cont++; items++;
                    if(cont == 3 || politicalParties.size() == items ){ %> </table></div> <% cont = 0;}
                    } %>
                    <div style="clear:left"></div>
                    <input type="hidden" value="Vote" name="action" />
                    <input type="submit" id="submit" value="Submit" class="formButt" />
                </form>
            </div>
        </section>
        <section class="second">
            <span></span>
        </section>
<%@include file="footer.jsp" %>
<% } %>
