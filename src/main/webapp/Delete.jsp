<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>

</head>
<body bgcolor="yellow">
<div align="center">
<br>
<h2>Deleting.... </h2><br>
<form action="DeleteUser">
UserID: <input type="text" value=<%=request.getParameter("uid") %> name="uid" readonly><br>
SrNo: <input type="text" value=<%=request.getParameter("Sr") %> name="SrNo" readonly><br>

<input type="submit" value="Confirm">

</form>
</div>
</body>
</html>