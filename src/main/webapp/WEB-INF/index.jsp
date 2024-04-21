<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<body>
	<table>
		<thead>
			<tr>
				<th>srn</th>
				<th>Name</th>
				<th>Email</th>
				<th>Addres</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${product}" var="p">
				<tr>
					<td>${p.id}</td>
					<td>${p.name}</td>
					<td>${p.email}</td>
					<td>${p.address}</td>
					<td><a href="delete/${p.id}">Delete</a></td>
					<td><a href="update/${p.id}">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add">adddata</a>

</body>
</html>
