<%@ include file="../commons/menu.jsp" %>
<%@ include file="../commons/header.jsp" %>

    <div align="center">
        <h2>User Registration</h2>
        <form:form action="register" method="post" modelAttribute="user">

            <form:hidden path="id" />

            <form:label path="name">name:</form:label>
            <form:input path="name"/><br/>
            <form:errors cssClass="error" path="name"/><br/>

             <form:label path="surname">surname:</form:label>
             <form:input path="surname"/><br/>
             <form:errors cssClass="error" path="surname"/><br/>

            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
            <form:errors cssClass="error" path="email"/><br/>

            <form:label path="phone">phone:</form:label>
            <form:input path="phone"/><br/>
            <form:errors cssClass="error" path="phone"/><br/>

            <form:label path="password">Password:</form:label>
            <form:password path="password"/><br/>
            <form:errors cssClass="error" path="password"/><br/>

            Profession:<form:select path="profession" items="${professionList}" itemValue="id" itemLabel="name" />
            <br><br>

           <input type="submit" value="Submit"/>
            <%@ include file="../commons/footer.jsp" %>
           </form:form>

       </div>
