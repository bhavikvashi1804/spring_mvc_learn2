<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/submitPerson">
		<table>
			<tr>
				<td>Person ID</td>
				<td><input type="number" name="id" /></td>
			</tr>
			<tr>
				<td>Person Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Person Age</td>
				<td><input type="number" name="age" /></td>
			</tr>
			<tr>
				<td><input type="submit" ></td>
				<td><input type="reset" ></td>
			</tr>

		</table>
	</form>

</body>
</html>