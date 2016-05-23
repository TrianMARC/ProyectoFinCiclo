<%@include file="header.jsp" %>

        <section class="main">
            <div class="login">
                <h2 class="section_title">User Panel</h2>
                <form action="../Dispatcher" method="post" class="eform"> 
                    
                    <label>
                        <input type="text" name="nif" placeholder="DNI/NIF" required/>
                    </label>
                    <label>
                        <input type="password" name="password" placeholder="PASSWORD" required/>
                    </label>
                    <input type="hidden" value="LogIn" name="action" />
                    <input type="submit" value="Sign In" class="formButt" /> <a class="formButt" href="signup.jsp">Sign Up</a>
                </form>
            </div>
        </section>
        <section class="second">
            <span></span>
        </section>
 <%@include file="footer.jsp" %>     
