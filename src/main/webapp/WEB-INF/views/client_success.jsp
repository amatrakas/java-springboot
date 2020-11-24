<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Congrats</title>
</head>
<body>
 <div align="center">
 <h2>Confirmed</h2>
 <p>Your submission succeeded!</p>
 FirstName:${client.firstname}</br>
 LastName:${client.lastname}</br>
 Gender:${client.gender}</br>
 Address:${client.address}</br>
 Cars:${client.cars}</br>
<c:forEach var="vehicle" items="${client.vehicles}">
<li>${vehicles}</li>
</c:forEach>
</ul>
</body>
</html>