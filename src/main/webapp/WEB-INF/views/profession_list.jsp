<%@ page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<%@ include file="header.jsp" %>
<h2>Professions found</h2>
<table border="1">
     <tr>
     <th>View</th>
     <th>Delete</th>
     <th>Name</th>
     </tr>

     <c:forEach items="${listp}" var="profession">
                      <tr>
                         <td><a href="view?professionid=${profession.id}">view profession</a></td>
                         <td><a href="erase?professionid=${profession.id}">Delete profession</td>
                        <td><c:out value="${profession.name}"/></td>
                      </tr>


     </c:forEach>
     </table>
     <p>${updated}</p>
     <p>${created}</p>
     <%@ include file="footer.jsp" %>


