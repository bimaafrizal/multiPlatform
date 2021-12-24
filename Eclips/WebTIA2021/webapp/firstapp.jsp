<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First App</title>
</head>
<body>

	<% 
		out.print("Hello World");
	%>
	<br>
	<%
		int a = 5;
		int b = 10;
		int hasil = a + b;
		out.print(hasil);
	%>
</body>
</html>