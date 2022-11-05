<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>

</head>
<body>
<body bgcolor="yellow">
<div align="center">
<br>
<h2 style="color:tomato">Backend Admin Portal</h2>
<br>

<form action="GetDetails">
UserID: <input type="text" name="uid"><br>
        <input type="submit" value="Get User Details">
</form>        
<br>
<form action="RegisterUser.jsp">
New User: <input type="submit" value="Register Here">
</form>
      
</div>
</body>
</html>