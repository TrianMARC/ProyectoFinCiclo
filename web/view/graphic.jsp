
<%@page import="java.awt.geom.Rectangle2D"%>
<%@page import="java.awt.Graphics2D"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="org.jfree.chart.ChartFactory"%>
<%@page import="org.jfree.chart.JFreeChart"%>
<%@page import="model.Political_party"%>
<%@page import="java.util.ArrayList"%>

<%@page import="org.jfree.chart.plot.*" %>
<%@page import="org.jfree.chart.ChartUtilities" %>
<%@page import="org.jfree.data.general.*" %>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
  <%  //Opening new session
   
    if (ses.getAttribute("user") == null) {
        response.sendRedirect("../index.jsp");
    } else {
        Voter user = (Voter) ses.getAttribute("user");
        ArrayList<Political_party> politicalParties = (ArrayList<Political_party>) ses.getAttribute("politicalParties");
        
        DefaultPieDataset data = new DefaultPieDataset();
        for(Political_party p : politicalParties){
            data.setValue(p.getName() + "-" + p.getNvotes(), p.getNvotes());     
        }
        
        
      JFreeChart graphic = ChartFactory.createPieChart("", data, true, true, false);
    
    
    
    BufferedImage img = new BufferedImage(400 , 400, BufferedImage.TYPE_INT_RGB); 
    Graphics2D g2 = img.createGraphics(); 
    graphic.draw(g2, new Rectangle2D.Double(0, 0, 400, 400)); 
    g2.dispose(); 
    
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    ImageIO.write(img, "png", Base64.getEncoder().wrap(os));
    String qr = os.toString("UTF-8");
%>

<section class="main">
    <div class="login">
        <h2 class="section_title">Results</h2>
        
        <img src="data:image/png;base64, <% out.print(qr); %> " style=" display: block; margin: 0 auto ">
        </div>
</section>

<%@include file="footer.jsp" %>
<% }%>
