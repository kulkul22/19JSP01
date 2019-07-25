<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jsp.demo.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is editUser page</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/editUser" method="post">
        <label> Username: </label>
        <input type="text" name="username" value="${user.username}" disabled="disabled"><br>
        <label> Password: </label>
        <input type="text" name="password" value="${user.password}" disabled="disabled"> <br>
        <label> Email: </label> 
        <input type="text" name="email" value="${user.email}"> <br>
<!--         <label>Choose Avatar</label> 
        <input type="file" name="avatar" /> <br/> -->
        <label>&nbsp; </label>
        <input type="hidden" name="id" value="${user.id}">
        <input type="submit" value="Update" name="update">
    </form>
</body>
</html>