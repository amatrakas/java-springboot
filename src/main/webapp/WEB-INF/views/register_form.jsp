<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
    <div align="center">
        <h2>User Registration</h2>
        <form:form action="register" method="post" modelAttribute="user">

            <form:hidden path="id" />

            <form:label path="name">name:</form:label>
            <form:input path="name"/><br/>

             <form:label path="surname">surname:</form:label>
             <form:input path="surname"/><br/>

            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>

            <form:label path="phone">phone:</form:label>
            <form:input path="phone"/><br/>

            <form:label path="password">Password:</form:label>
            <form:password path="password"/><br/>

           <input type="submit" value="Submit"/>

           </form:form>



      </div>
      <p>${created}</p>
      <p>${updated}</p>
            <a href="showusers">show my users</a>
           </body>
        </html>