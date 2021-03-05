<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${date}</h1>
	<table>
		<tr>
			<td>Person ID: </td>
			<td>${person.getId()}</td>
		</tr>
		<tr>
			<td>Person Name: </td>
			<td>${person.getName()}</td>
		</tr>
		<tr>
			<td>Person Age: </td>
			<td>${person.getAge()}</td>
		</tr>
	</table>
</body>
</html>