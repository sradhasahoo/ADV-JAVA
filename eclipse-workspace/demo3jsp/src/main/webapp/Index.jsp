<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>JSP Demo</title>
</head>

<body>

<h2>JSP Tags, Action Tags and JSTL</h2>

<%
    String name = "Anu";
    int marks = 85;
%>

<!-- JSP Expression Tag -->
<p>Name: <%= name %></p>
<p>Marks: <%= marks %></p>

<!-- JSP Action Tag -->
<jsp:forward page="result.jsp">
    <jsp:param name="studentName" value="<%= name %>" />
    <jsp:param name="studentMarks" value="<%= marks %>" />
</jsp:forward>

</body>
</html>