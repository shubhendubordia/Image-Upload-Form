<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image Uploaded!!!!</title>
</head>
<body>
<h1>${msg }</h1>

<img alt="profile image" src="<c:url value = "/resources/image/${filename }"></c:url>"width="400" 
     height="500" /> 
 
</body>
</html>