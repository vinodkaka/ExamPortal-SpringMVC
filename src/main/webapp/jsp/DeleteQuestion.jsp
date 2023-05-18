<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>AllQuestions</title>
</head>
<body>
<center>
<h1>AllQuestions</h1><br>
</center>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">questionId</th>
      <th scope="col">question</th>
      <th scope="col">option1</th>
      <th scope="col">option2</th>
      <th scope="col">option3</th>
       <th scope="col">option4</th>
       <th scope="col">correctAnswer</th>
       <th scope="col">marks</th>
          <th scope="col">examId</th>
     
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${questions}" var="q">
    <tr>
      
     <th scope="row">${q.questionId}</th>
      <td>${q.question}</td>
      <td>${q.option1}</td>
      <td>${q.option2}</td>
      <td>${q.option3}</td>
      <td>${q.option4}</td>
      <td>${q.correctAnswer}</td>
      <td>${q.marks}</td>
      <td>${q.exam.examId}</td>
       <td><a href="deletequestion/${q.questionId}" class="btn btn-danger">Delete</a></td>
       <td><a href="updatequestion" class="btn btn-primary">Update</a></td>
      
      
      
    </tr>
    </c:forEach>
    
  </tbody>
</table>
 
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  

</body>
</html>