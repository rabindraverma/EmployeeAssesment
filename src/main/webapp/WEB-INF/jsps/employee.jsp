<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee page</title>
</head>
<body>
<h1>Enter Details to add new Employee</h1>
<form action="addDetails" method="post">
<pre>
Name<input name="name" type="text">
Email<input name="email" type="email">
DOB<input name="dob" type="text">
Salary<input name="salary" type="text">
Status<input name="status" type="text">
<input type="submit" name="save">
</pre>

</form>
${msg}

</body>
</html>