<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<body>
<form action="http://localhost:8082/Assignment/Register" method="post">
                <label for="empname">Employee name:</label>
                <input type="text"  id="empname" name="empname" required><br>

                 <label for="doj">Date of Join:</label>
                <input type="date" id="doj" name="doj" required><br>

                <label for="salry"> Salary:</label>
                <input type="text" id="salry"  name="salry" required><br>

                <button type="submit">Register</button> </form>
                <form action="login.jsp">
                <h3>Already have a account?</h3>
                <button type="submit" >Login</button></form>
</body>
</html>