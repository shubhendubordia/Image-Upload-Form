<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success
</title>
</head>
<body>
<h1>${message }</h1>
<h5>${header }</h5>

<p>${desc }</p>
<h1>welcome,${user.userName }</h1>
<h2>Your Email is ${user.email }</h2>
<h3>Your pasword is ${user.passWord }</h3>
</body>
</html>