<%@ page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../commons/menu.jsp" %>
<%@ include file="../commons/header.jsp" %>
<h2>users found</h2>
<table border="1">
     <tr>
     <th>Edit</th>
     <th>Delete</th>
     <th>Name</th>
     <th>Surname</th>
     <th>Password</th>
     <th>Email</th>
     <th>Phone</th>
     <th>Profession</th>
     </tr>
     <c:forEach items="${list}" var="user">
            <tr>
              <td><a href="edit?userid=${user.id}">edit user</a></td>
              <td><a href="delete?userid=${user.id}">delete user</a></td>


              <td><c:out value="${user.name}"/></td>
              <td><c:out value="${user.surname}"/></td>
              <td><c:out value="${user.password}"/></td>
              <td><c:out value="${user.email}"/></td>
              <td><c:out value="${user.phone}"/></td>
              <td><c:out value="${user.profession.name}"/></td>

             </tr>

     </c:forEach>
 </table>



<%@ include file="../commons/footer.jsp" %>

