<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
    <div align="center">
        <h2>Registration Succeeded!</h2>
        <span>name:</span><span>${user.name}</span><br/>
        <span>surname:</span><span>${user.surname}</span><br/>
        <span>phone:</span><span>${user.phone}</span><br/>
        <span>E-mail:</span><span>${user.email}</span><br/>
        <span>Password:</span><span>${user.password}</span><br/>

           </div>
           <p>--${errorCase}--
           </p>

           </p>
        </body>
        </html>