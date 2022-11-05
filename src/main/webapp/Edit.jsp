<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body bgcolor="yellow">
<div align="center">
<h2> Edit User Details </h2>
<form action="EditUser">
SrNo: <input type="text" value=<%=request.getParameter("Sr") %> name="SrNo" readonly><br>
UserID: <input type="text" value=<%=request.getParameter("uid") %> name="uid" readonly><br>
Enter Name: <input type="text" name="uname"><br>
Enter Aadhar Number: <input type="text" name="aadhar"><br>
Enter Contact Number: <input type="text" name="contact"><br>

Enter Password: <input type="text" name="password"><br>
<input type="submit">
</form>
</div>
</body>
</html>