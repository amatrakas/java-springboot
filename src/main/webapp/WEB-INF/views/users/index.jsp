<%@ include file="menu.jsp" %>
<%@ include file="header.jsp" %>
        <h1>Spring Boot Form Login</h1>
         <h2>Login page</h2>
                <form:form action="/" method="post" modelAttribute="user">

                    <form:label path="email">email:</form:label>
                    <form:input path="email"/><br/>


                    <form:label path="password">Password:</form:label>
                    <form:password path="password"/><br/>


                   <input type="submit" value="Submit"/>
                   </form:form>
                   <a href="/register">register please</a>

                   <p>${error}</p>

                  <@% include file="footer.jsp"%>
