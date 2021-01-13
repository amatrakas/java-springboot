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
<table border="1">
     <tr>
     <th>Id</th>
     <th>Name</th>
     <th>Surname</th>
     <th>Password</th>
     <th>Email</th>
     <th>Phone</th>
     <th>Profession</th>
     </tr>
     <c:forEach items="${list}" var="user">
            <tr>
              <td border="1"><a href="/edit?userid=${user.id}">edit user</a>,<a href="/delete?userid=${user.id}">delete user</a></td>


              <td><c:out value="${user.name}"/></td>
              <td><c:out value="${user.surname}"/></td>
              <td><c:out value="${user.password}"/></td>
              <td><c:out value="${user.email}"/></td>
              <td><c:out value="${user.phone}"/></td>
              <td><c:out value="${user.profession.name}"/></td>

             </tr>

     </c:forEach>
 </table>
 <p>${created}</p>
 <p>${updated}</p>


</body>

    </html>
