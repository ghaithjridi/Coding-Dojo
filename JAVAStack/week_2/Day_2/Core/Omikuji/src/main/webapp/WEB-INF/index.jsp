<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send an Omikiuji!! </h1>
<form action="/processForm" method="POST">
<label>pick any number from 5 to 25: </label>
<input type="number" name="number">
<label>enter the name of any city :</label>
<input type="text"  name="city">
<label>enter the name of any person:</label>
<input type="text"  name="person">
<label>enter professional endevaor or hobby: </label>
<input type="text" name="professional">
<label>enter any type of living thing:</label>
<input type="text" name="living">
<label>say something to someone: </label>
<input type="description" name="something" >
<h1>send and show a friend</h1>
<button> send</button>
</form>

</body>
</html>