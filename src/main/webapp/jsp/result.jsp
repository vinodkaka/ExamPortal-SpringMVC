<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${numCorrect}
<c:if test="${numCorrect > 3}">
  <p> you have Passed</p>
</c:if>
<c:if test="${numCorrect <= 3}">
  <p>you have Failed</p>
</c:if>
</body>
</html>