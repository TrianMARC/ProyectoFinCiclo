<%-- 
    Document   : index
    Created on : 04-may-2016, 19:41:23
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
        <section class="main">
            <div class="login" style="margin-top:50px;">
                <h2 class="section_title">Sign Up</h2>
                
                <form action="../Dispatcher" method="post" class="eform"> 
                    <span style="font-size:0.9em;"><span style="color:red">*</span>All fields are required.</span>
                    <fieldset>
                        <legend>Log-In information</legend>
                        <label>
                            <input type="text" name="nif" id="nif" placeholder="DNI/NIF" required/>
                        </label>
                        <label>
                            <input type="password" name="password" id="password" placeholder="Password" required/>
                        </label>
                        <label>
                            <input type="password" name="confpassword" id="confpassword" placeholder="Password confirm" required/>
                        </label>
                        <span id="errorpassword"></span>
                    </fieldset>
                    <fieldset style="float:left; width: 42%">
                        <legend>Personal information</legend>
                        <label>
                            <input type="text" name="name" id="name" placeholder="Name" required/>
                        </label>
                        <label>
                            <input type="text" name="surname" id="surname" placeholder="Surname" required/>
                        </label>
                        <label>
                            <input type="text" name="email" id="email" placeholder="Email" required/>
                        </label>
                    </fieldset >
                    <fieldset style="float:left; width: 42%">
                        <legend>Address</legend>
                        <label>
                            <input type="text" name="address" id="address" placeholder="Address" required/>
                        </label>
                        <label>
                            <input type="text" name="zipcode" id="zipcode" placeholder="Zip Code" required/>
                        </label>
                    </fieldset>
                    <div style="clear:left"></div>
                    <label>
                        <input type="checkbox" value="0" required/><span>Do you accept the terms and conditions?</span>
                    </label>
                    <input type="hidden" value="Register" name="action" />
                    <input type="submit" id="submit" value="Submit" class="formButt" />
                </form>
            </div>
        </section>
        <section class="second">
            <span></span>
        </section>
 <script type="text/javascript" src="../js/signup.js"></script>
<%@include file="footer.jsp" %>
