<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

 <h2>users found</h2>

 <c:forEach items="${list}" var="user">
     <tr>
         <td>User ID: <c:out value="${user.id}"/></td><br>
         <td>User Name: <c:out value="${user.name}"/></td><br>
         <td>User Surname:<c:out value="${user.surname}"/></td><br>
         <td>User Password:<c:out value="${user.password}"/></td><br>
         <td>User Email:<c:out value="${user.email}"/></td><br>
         <td>User Phone:<c:out value="${user.phone}"/></td><br>
         <br>
     </tr>
 </c:forEach>

</body>

    </html>
