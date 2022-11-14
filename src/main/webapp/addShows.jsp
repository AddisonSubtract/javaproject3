<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Shows</title>
<style>
body {
	background-color: darkgray;
}
.block {
	display: block;
	width: 100%;
	border: none;
	background-color: #E50914;
	padding: 14px 20px;
	font-size: 16px;
	cursor: pointer;
	text-align: center;
}

.block:hover {
	background-color: #ddd;
	color: black;
}
</style>
</head>
<body>

	<form>
		Add a Show: <input type="text" name="addShow" size="50"> <br>
		<input type="submit" class="block" value="Submit" name="addShowButton"> <br>
	</form>
	
</body>
</html>