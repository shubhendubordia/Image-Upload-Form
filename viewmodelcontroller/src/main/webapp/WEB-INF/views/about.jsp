<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about</title>
</head>
<body>

	<h1>this is about page </h1>
	<% 
	String name = (String) request.getAttribute("name"); 
	
	%>
	<h1>this is my <%=name %></h1>

</body>
</html>