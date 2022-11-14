<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String movieData = (String) request.getAttribute("DropdownData");
	%>
	
	<%=movieData%>
	
	Add a Show: <input type="text" name="addShow" value=""> <br>
	<input type="submit" value="Submit" name="showButton"> <br>
</body>
</html>