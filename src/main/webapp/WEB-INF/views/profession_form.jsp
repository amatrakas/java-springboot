 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <title>Fill your Profession</title>
 <body>
 <%@ include file="header.jsp" %>
 <%@ include file="menu.jsp" %>

     <div align="center">
         <h2>Fill your profession</h2>
         <form:form action="profession" method="post" modelAttribute="profession">

             <form:hidden path="id" />

             <form:label path="name">name:</form:label>
             <form:input path="name"/><br/>
             <form:errors cssClass="error" path="name"/><br/>

            <input type="submit" value="Submit"/>

             <%@ include file="footer.jsp" %>

         </form:form>
     </div>
 </body>
 </html>