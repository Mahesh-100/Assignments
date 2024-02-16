<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<form action="http://localhost:8082/Assignment/Login"  method="post">
 <label for="empId">Enter Employee ID:</label>
 <input type="text"  id="empId" name="empId" required><br>
 
 <input type="submit" value="submit">
 </form>
</body>
</html>