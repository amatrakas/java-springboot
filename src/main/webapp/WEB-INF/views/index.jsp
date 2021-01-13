    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
    <style>
    .error{
        color:red
      }
    </style>

    </head>
    <body>
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
    </body>
    </html>