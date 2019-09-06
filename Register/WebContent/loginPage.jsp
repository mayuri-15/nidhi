<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
<form action="LoginServlet" method="post">
<h2>UserName</h2>
<input type="text" name="UserId" placeholder="enter your userId" >
<h2>Password</h2>
<input type="password" name="password" placeholder="enter your password" >
<input type="submit" value="submit">
if not an existing user then register
</form>
</body>
</html>