 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <!DOCTYPE html>
 <html>
 <head>
 <meta charset="ISO-8859-1">
 <title></title>
 <style>
 .error{
     color:red
   }
 </style>

 </head>
 <body>
     <div align="center">
         <h2>Fill your profession</h2>
         <form:form action="profession" method="post" modelAttribute="profession">

             <form:hidden path="id" />

             <form:label path="name">name:</form:label>
             <form:input path="name"/><br/>
             <form:errors cssClass="error" path="name"/><br/>

            <input type="submit" value="Submit"/>
         </form:form>
     </div>
 </body>
 </html>