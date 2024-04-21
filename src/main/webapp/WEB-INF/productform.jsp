<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="handle-product" method="post">
		Enter Name <br>
		<input type="text" name="name"><br><br>
		Enter Email <br>
		<input type="email" name="email"><br><br>
		Enter Address <br>
		<textarea rows="3" name="address"></textarea><br><br>
		<input type="submit" value="Submit"><br>
	</form>
	<a href="add">adddata</a>
</body>
</html>