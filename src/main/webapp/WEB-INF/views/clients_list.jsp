<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<body>
<h2>Clients found</h2>
<table border="1">
     <tr>
     <th>Review</th>
     <th>Remove</th>
     <th>Firstname</th>
     <th>Lastname</th>
     <th>Gender</th>
     <th>Address</th>
     <th>Cars</th>
     <th>Profession</th>
     </tr>

      <c:forEach items="${listc}" var="client">
                 <tr>
                    <td><a href="review?clientid=${client.id}">review client</a></td>
                    <td><a href="remove?clientid=${client.id}"</a>remove client</td>
                   <td><c:out value="${client.firstname}"/></td>
                   <td><c:out value="${client.lastname}"/></td>
                   <td><c:out value="${client.gender}"/></td>
                   <td><c:out value="${client.address}"/></td>
                   <td><c:out value="${client.cars}"/></td>
                   <td><c:out value="${client.profession.name}"/></td>

                 </tr>



      </c:forEach>
      </table>

    <%@ include file="footer.jsp" %>
      </body>

      </html>
