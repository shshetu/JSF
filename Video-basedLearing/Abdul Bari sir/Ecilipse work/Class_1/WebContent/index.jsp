<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World!</h1>
<!-- Expressions -->
<%= (2+2) %>
<p>The current time is <%= new Date()%> precisely!</p>
<!-- Declarations -->
<%! int a = 5; %>
<!-- scriplets -->
<%if(a>5) {%>
<input type="text">
<%}else{ %>
<input type="button" value="ok">
<%} %>
</body>
</html>