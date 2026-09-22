
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>

    <h2>Student Registration Form</h2>

    <form action="${pageContext.request.contextPath}/StudentServlet"
          method="post">

        <label>Student Name:</label>
        <input type="text" name="name" required>
        <br><br>

        <label>Email:</label>
        <input type="email" name="email" required>
        <br><br>

        <label>Course:</label>
        <select name="course" required>
            <option value="">-- Select Course --</option>
            <option value="Computer Science">
                Computer Science
            </option>
            <option value="Information Technology">
                Information Technology
            </option>
            <option value="Data Science">
                Data Science
            </option>
            <option value="Artificial Intelligence">
                Artificial Intelligence
            </option>
        </select>
        <br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>