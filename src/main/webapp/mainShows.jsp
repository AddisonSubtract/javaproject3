<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Shows</title>

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
		<%
		String movieData = (String) request.getAttribute("DropdownData");
		%>

		<%=movieData%>

		<input type="submit" class="block" value="Return" name="returnShowButton">
		<br>
	</form>
</body>
</html>