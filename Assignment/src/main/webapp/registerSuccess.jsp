<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
<h3>Remember your employee Id:</h3> <%=request.getAttribute("empId")%>
<form action="login.jsp">
 <h3>login here</h3>
  <button type="submit" >Login</button></form>
</body>
</html>