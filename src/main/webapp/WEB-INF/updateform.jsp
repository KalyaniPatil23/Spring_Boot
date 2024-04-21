<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>${product.id}</h2>
	<form action="${pageContext.request.contextPath}/handle-product" method="post">
		Enter Name <br><br>
		<input type="text" name="name" value="${product.name}"><br><br>
		Enter Email <br>
		<input type="email" name="email" value="${product.email}"><br><br>
		Enter Address <br>
		<textarea rows="3" name="address" >${product.address}</textarea><br><br>
		<input type="submit" value="Submit"><br>
	</form>
</body>
</html>