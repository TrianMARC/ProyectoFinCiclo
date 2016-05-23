<%-- 
    Document   : index
    Created on : 04-may-2016, 19:41:23
    Author     : victo
--%>

<%
    //Opening new session
    HttpSession ses = request.getSession(true);
    if(ses.getAttribute("user")!=null){
        response.sendRedirect("view/userpanel.jsp");
    }else{
         response.sendRedirect("view/main.jsp");
    } %>
