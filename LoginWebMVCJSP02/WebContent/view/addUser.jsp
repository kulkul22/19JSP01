<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jsp.demo.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is addUser page</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/addUser" enctype="multipart/form-data" method="post">
        <label> Username: </label>
        <input type="text" name="username"><br>
        <label> Password: </label>
        <input type="text" name="password"> <br>
        <label> Email: </label> 
        <input type="text" name="email"> <br>
        <label> Role: </label> 
        <select name="role">
		  <option value="1">Administrator</option>
		  <option value="2" selected>User</option>
		</select> <br>
		<label>Choose Avatar</label> 
        <input type="file" name="avatar" /> <br/>
<!--         <label>Choose Avatar</label> 
        <input type="file" name="avatar" /> <br/> -->
        <label>&nbsp; </label>
        <input type="submit" value="Add" name="add">
    </form>
</body>
</html>