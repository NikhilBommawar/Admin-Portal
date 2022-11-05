<%@page import="com.example.UserPOJO"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>

</head>

<body bgcolor="yellow">
<jsp:include page="indexx.jsp" ></jsp:include>
<div align="center">
<br><br>

<h2>User details are</h2><br>
<%
  UserPOJO user=(UserPOJO)request.getAttribute("user");
 %>
 <table border="1">
 <tr><th>SrNo</th><th>Name</th><th>AadharNo</th><th>ContactNo</th><th>UserID</th><th>Password</th></tr>
 <tr><td><%=user.getSrNo()%></td><td><%=user.getUname()%></td><td><%= user.getAadhar() %></td><td><%=user.getContact()%></td><td><%=user.getUid()%></td><td><%=user.getPassword() %></td><td><a href="Edit.jsp?uid='<%=user.getUid()%>'&Sr='<%=user.getSrNo()%>'">Edit</a></td><td><a href="Delete.jsp?uid='<%=user.getUid()%>'&Sr='<%=user.getSrNo()%>'">Delete</a></td></tr>
  </table>

 </div>
</body>
</html>