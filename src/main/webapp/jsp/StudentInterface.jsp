<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You have logged sucessfully</h1>
<h1>welcome ${uname} </h1>
<h1>please select the service to Perform the specific action </h1>
<form action="GetReportByStudentId">
<input type="submit" value="GetReportByStudentId">
</form>
<br><br>
<form action="exam">
<input type="submit" value="writeexam">
</form>
<br><br>
<form action="GetStudentById">
<input type="submit" value="GetStudentById">
</form>
</body>
</html>