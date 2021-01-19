<%@ include file="../commons/menu.jsp" %>
<%@ include file="../commons/header.jsp" %>

    <div align="center">
        <h2>New Form</h2>


            <form:form action="client" method="post" modelAttribute="client">
             <form:hidden path="id" />
            <form:label path="firstname">FirstName:</form:label>
            <form:input path="firstname"/><br/>
            <form:errors cssClass="error" path="firstname"/><br/>
             <form:label path="age">Age:</form:label>
             <form:input path="age"/><br/>
             <form:errors cssClass="error" path="age"/><br/>
               <form:label path="lastname">LastName:</form:label>
               <form:input path="lastname"/><br/>
               <form:errors  cssClass="error" path="lastname"/><br/>
               Male <form:radiobutton path="gender" value="male"/>
                Female <form:radiobutton path="gender" value="female"/>
                Other <form:radiobutton path="gender"  value="other"/>
                <br><br>
                <form:label path ="address">Address</form:label>
                <form:textarea path = "address" rows = "5" cols = "30"/>
                <br>
                Cars:
                <form:select path="cars" multiple="true">
                <form:option value="volvo" label="volvo"/>
                <form:option value="saab"  label="saab"/>
                <form:option value="opel"  label="opel"/>
                <form:option value="audi"  label="audi"/>
                </form:select>
                <br><br>
                Professions:<form:select path="profession" items="${professionList}" itemValue="id" itemLabel="name" />
                 <br><br>


           <input type="submit" value="Submit"/>
            <%@ include file="../commons/footer.jsp" %>
           </form:form>


      </div>


