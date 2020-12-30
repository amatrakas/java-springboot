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

 <h2>Professions found</h2>
<table border="1">
     <tr>
     <th>ID</th>
     <th>Name</th>
     </tr>

     <c:forEach items="${listp}" var="profession">
                      <tr>
                         <td><a href="/view?professionid=${profession.id}">view profession</a>,<a href="/erase?professionid=${profession.id}">Delete profession</td>
                        <td><c:out value="${profession.name}"/></td>
                      </tr>


     </c:forEach>
     </table>
     <p>${updated}</p>
     <p>${created}</p>
     </body>
     </html>

