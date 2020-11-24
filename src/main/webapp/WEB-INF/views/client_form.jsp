<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My New Form</title>
<style>
.error{
    color:red
  }
</style>
</head>
</head>
<body>
    <div align="center">
        <h2>New Form</h2>


            <form:form action="client" method="post" modelAttribute="client">

            <form:label path="firstname">FirstName:</form:label>
            <form:input path="firstname"/><br/>
            <form:errors cssClass="error" path="firstname"/><br/>
             <form:label path="age">Age:</form:label>
             <form:input path="age"/><br/>
             <form:errors cssClass="error" path="age"/><br/>
               <form:label path="lastname">LastName:</form:label>
               <form:input path="lastname"/><br/>
               <form:errors  cssClass="error" path="lastname"/><br/>
               Male <form:radiobutton path="gender" value="male"/>
                Female <form:radiobutton path="gender" value="female"/>
                Other <form:radiobutton path="gender"  value="other"/>
                <br><br>
                <form:label path = "address">Address</form:label>
                <form:textarea path = "address" rows = "5" cols = "30"/>
                <br>
                <br>
                <form:select path="cars" multiple="true">
                <form:option value="volvo" label="volvo"/>
                <form:option value="saab"  label="saab"/>
                <form:option value="opel"  label="opel"/>
                <form:option value="audi"  label="audi"/>
                </form:select>
                <br>
                <br>
                <form:checkbox path="vehicles" value="car"/>I have a car
                <form:checkbox path="vehicles" value="boat"/>I have a boat
                <form:checkbox path="vehicles" value="bike"/>I have a bike<br><br>


        ${client.save}


           <input type="submit" value="Submit"/>

           </form:form>


      </div>

           </body>
        </html>