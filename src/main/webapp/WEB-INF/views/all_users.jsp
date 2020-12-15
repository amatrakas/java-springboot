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
 <table>
     <tr>
     <th>ID</th>
     <th>Name</th>
     <th>Surname</th>
     <th>Password</th>
     <th>Email</th>
     <th>Phone</th>
     </tr>
        <tr>
         <td><c:out value="${user.id}"/></td>
          <td><c:out value="${user.name}"/></td>
          <td><c:out value="${user.surname}"/></td>
          <td><c:out value="${user.password}"/></td>
          <td><c:out value="${user.email}"/></td>
          <td><c:out value="${user.phone}"/></td>
         </tr>
     </table>
 </c:forEach>

</body>

    </html>
