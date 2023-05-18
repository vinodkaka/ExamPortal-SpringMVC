<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
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
<form action="AddExam">
<input type="submit" value="AddExam">
</form>
<br><br>
<form action="UpdateExam">
<input type="submit" value="UpdateExam">
</form>
<br><br>
<form action="DeleteExam">
<input type="submit" value="DeleteExam">
</form>
<br><br>
<form action="GetExamById">
<input type="submit" value="GetExamById">
</form>
<br><br>
<form action="GetAllExams">
<input type="submit" value="GetAllExams">
</form>
<br><br>
<form action="AddQuestions">
<input type="submit" value="AddQuestions">
</form>
<br><br>
<form action="UpdateQuestions">
<input type="submit" value="UpdateQuestions">
</form>
<br><br>
<form action="DeleteQuestion">
<input type="submit" value="DeleteQuestion">
</form>
<br><br>
<form action="GetAllQuestions">
<input type="submit" value="GetAllQuestions">
</form>
<br><br>
<form action="GetQuestionById">
<input type="submit" value="GetQuestionById">
</form>
<br><br>
<form action="AddStudent">
<input type="submit" value="AddStudent">
</form>
<br><br>
<form action="UpdateStudent">
<input type="submit" value="UpdateStudent">
</form>
<br><br>
<form action="DeleteStudent">
<input type="submit" value="DeleteStudent">
</form>
<br><br>
<form action="GetAllStudents">
<input type="submit" value="GetAllStudents">
</form>
<br><br>
<form action="GetStudentById">
<input type="submit" value="GetStudentById">
</form>
<br><br>
<form action="GetAllReports">
<input type="submit" value="GetAllReports">
</form>
<br><br>
<form action="GetReportByStudentId">
<input type="submit" value="GetReportByStudentId">
</form>
<br><br>
<form action="Exit">
<input type="submit" value="Exit">
</form>
<br><br>
<form action="exam">
<input type="submit" value="writeexam">
</form>
<br><br>
</body>
</html>