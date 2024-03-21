<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="loginCheck" method="post">
		<label>UserName </label><br>
		<input type="text" name="name"><br>
		<label>Password </label><br>
		<input type="password" name="pwd"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>