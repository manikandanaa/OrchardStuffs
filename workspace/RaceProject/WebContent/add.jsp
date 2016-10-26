<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addmembers</title>
</head>
<body>
	 <form action="enroll" method="post">
		<input type="text" name="user"><br>
		<input type="password" name="pass"><br>
		<input type="text" name="no"><br>
		<select name="type">
		<option>Profession</option>
		<option>Trainee</option>
		</select><br>
		<input type="submit" value="Enroll now">
		<input type="reset" value="clear">
	</form>
	<a href="log.jsp">Sign your Events Here</a>
</body>
</html>