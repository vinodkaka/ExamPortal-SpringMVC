<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddExams" method="post">
<h2>Enter the below details to add the exam</h2>
Exam id: <input type="text" name="examId"/>
Exam Name: <input type="text" name="examName"/>
Exam duration in minutes: <input type="text" name="examDuration"/>
Exam Date: <input type="text" name="examDate"/>
Exam Percentage: <input type="text" name="examPercentage"/>
<input type="submit"/>
</form>
</body>
</html>