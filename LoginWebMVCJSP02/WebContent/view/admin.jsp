<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jsp.demo.model.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is admin page</title>
</head>
<body>
	<p>You are successfully logged in!</p>
	<table>
		<tr>
			<th>ID</th>
			<th>Email</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Role</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.email}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.role}</td>
			<td><a href="editUSer">Edit</a></td>
			<td><a href="">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>