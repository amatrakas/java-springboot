<%@ include file="../commons/menu.jsp" %>
<%@ include file="../commons/header.jsp" %>

     <div align="center">
         <h2>Fill your profession</h2>
         <form:form action="profession" method="post" modelAttribute="profession">

             <form:hidden path="id" />

             <form:label path="name">name:</form:label>
             <form:input path="name"/><br/>
             <form:errors cssClass="error" path="name"/><br/>

            <input type="submit" value="Submit"/>

             <%@ include file="../commons/footer.jsp" %>

         </form:form>
     </div>
