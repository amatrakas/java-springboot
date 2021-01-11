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

 <h2>Clients found</h2>
<table border="1">
     <tr>
     <th>ID</th>
     <th>Firstname</th>
     <th>Lastname</th>
     <th>Gender</th>
     <th>Address</th>
     <th>Cars</th>
     <th>Profession</th>
     </tr>

      <c:forEach items="${listc}" var="client">
                 <tr>
                    <td><a href="/review?clientid=${client.id}">review client</a>,<a href="/remove?clientid=${client.id}"</a>remove client</td>
                   <td><c:out value="${client.firstname}"/></td>
                   <td><c:out value="${client.lastname}"/></td>
                   <td><c:out value="${client.gender}"/></td>
                   <td><c:out value="${client.address}"/></td>
                   <td><c:out value="${client.cars}"/></td>
                   <td><c:out value="${client.profession.name}"/></td>

                 </tr>



      </c:forEach>
      </table>
      <p>${created}</p>
      <p>${updated}</p>

      </body>

      </html>
