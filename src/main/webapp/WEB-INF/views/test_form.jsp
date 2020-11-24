<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Test Form</title>
</head>
<body>
<h2>Test Form</h2>
<form action="submitForm" method="post" ModelAttribute="client">
<label for="firstname">First Name</label><br>
<input type="text" id="firstname" name="firstname">
<br>
<label for="lastname">Last Name</label><br>
<input type="text" id="lastname" name="lastname"
<br>
  <br>
  <br>
  <input type="radio" id="male" name="gender" value="male">
	<label for="male">Male</label><br><input type="radio" id="female" name="gender" value="female">
	<label for="female">Female</label><br><input type="radio" id="other" name="gender" value="other">
	<label for="other">Other</label>
	<br>
	<br>
	<input type="checkbox" id="vehicle1" name="vehicles" value="Bike">
  <label for="vehicle1"> I have a bike</label><br>
  <input type="checkbox" id="vehicle2" name="vehicles" value="Car">
  <label for="vehicle2"> I have a car</label><br>
  <input type="checkbox" id="vehicle3" name="vehicles" value="Boat">
  <label for="vehicle3"> I have a boat</label><br>
  <br>
  <textarea id="address" name="address" rows="20" cols="40">
  </textarea>
  <input type="hidden" id="custom" name="custom" value="45673"
  <br>
  <br>
  <br>
 <label for="cars">Choose a car:</label>
<select name="cars" id="cars" multiple>
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="opel">Opel</option>
  <option value="audi">Audi</option>
</select>
   <br>
   <br>
  <input type="submit" value="click me re">
</form>
</body>
</html>