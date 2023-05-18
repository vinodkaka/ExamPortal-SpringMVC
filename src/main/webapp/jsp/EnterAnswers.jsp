<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>



<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h1>Index page</h1>
</body>
<form action="submitanswer" method="post">
    <c:if test="${not empty questions}">
      <c:forEach items="${questions}" var="question">
        <br><br><br>
        QuestionId: ${question.questionId}
        <br>Question: ${question.question}
        <br>Option1: ${question.option1}
        <br>Option2: ${question.option2}
        <br>Option3: ${question.option3}
        <br>Option4: ${question.option4}
     <%--    <input type="hidden" name="correctAnswers[${question.questionId}]" value="${question.correctAnswer}"/> --%>
        Enter answer:<input type="text" name="answers[${question.questionId}]">
      </c:forEach>
    </c:if>
    <br><br>
    <input type="submit" name="submitanswer">
  </form>
 
</body>


</html>





