<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>create a book </h1>
<form action="/books/processBook" method="post">
title:<input name="title"><br>
Language:<input name="Language"><br>
description:<input name="description"><br>
number of page:<input name="numOfPages"><br>
<button>Create</button>

</form>

</body>
</html>