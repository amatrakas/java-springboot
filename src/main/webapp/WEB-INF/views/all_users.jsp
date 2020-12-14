<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

        <h2>users found</h2>

        <form:form action="profession" method="post" modelAttribute="user">

        </form:form>

        <p>${list}</p>

        </body>

        </html>
