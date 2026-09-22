<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Result</title>
</head>

<body>

<h2>Student Result</h2>

<p>
    Name:
    <%= request.getParameter("studentName") %>
</p>

<p>
    Marks:
    <%= request.getParameter("studentMarks") %>
</p>

<c:choose>

    <c:when test="${param.studentMarks >= 75}">
        <h3>Result: PASS</h3>
        <p>Grade: Distinction</p>
    </c:when>

    <c:when test="${param.studentMarks >= 50}">
        <h3>Result: PASS</h3>
        <p>Grade: First Class</p>
    </c:when>

    <c:otherwise>
        <h3>Result: FAIL</h3>
    </c:otherwise>

</c:choose>

</body>
</html>