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

<title>All Students</title>
</head>
<body>
<center>
<h1>Students information</h1><br>
</center>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Student_Id</th>
      <th scope="col">StudentName</th>
      <th scope="col">Student Email</th>
      <th scope="col">StudentPassword</th>
      <th scope="col">Enrolled Exam</th>
      
     
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${students}" var="s">
    <tr>
      
     <th scope="row">${s.studentId}</th>
      <td>${s.studentName}</td>
      <td>${s.studentEmail}</td>
      <td>${s.studentPassword}</td>
      <td>${s.enrolExam}</td>
     <td><a href="deletestudent/${s.studentId}" class="btn btn-danger">Delete</a></td>
      <td><a href="updatestudent" class="btn btn-primary">Update</a></td>
       
      
      
      
    </tr>
    </c:forEach>
    
  </tbody>
</table>
 
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  

</body>
</html>