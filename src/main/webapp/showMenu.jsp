<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Page</title>
</head>

<style>
body {
	background-color: darkgray;
}
.block {
	display: block;
	width: 100%;
	border: none;
	background-color: #E50914;
	padding: 14px 28px;
	font-size: 16px;
	cursor: pointer;
	text-align: center;
}

.block:hover {
	background-color: #ddd;
	color: black;
}
</style>

<body>
	<form>
		<input type="submit" class="block" value="View Shows!" name="display">
		<input type="submit" class="block" value="Add New Show" name="add">
		<input type="submit" class="block" value="Logout" name="logout">
	</form>

</body>
</html>