<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<style>
#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>
<h1>All Employees List</h1>

<table id=customers>
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Date of birth</th>
		<th>Age</th>
		<th>Salary</th>
		<th>Employee Status</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${allEmployees}" var="allEmployees">
	<tr>
		<td>${allEmployees.name}</td>
		<td>${allEmployees.email}</td>
		<td>${allEmployees.dob}</td>
		<td>${allEmployees.age}</td>
		<td>${allEmployees.salary}</td>
		<td>${allEmployees.status}</td>
		<td><a href="">update</a></td>
		<td><a href="deleteEmployee?id=${allEmployees.id}">delete</a></td>
	</tr>
	</c:forEach>

</table>
${msg }
</body>
</html>