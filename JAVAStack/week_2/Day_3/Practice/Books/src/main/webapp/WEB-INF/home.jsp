<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" href="/css/main.css">

<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">

	<h1>Book Store</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Title</th>
				<th>description</th>
				<th>language</th>
				<th>pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allBooks }" var="oneBook">
				<tr>
					<td><a href="/books/${oneBook.id }">${oneBook.title }</a></td>
					<td>${oneBook.description }</td>
					<td>${oneBook.language }</td>
					<td>${oneBook.numberOfPages }</td>


				</tr>


			</c:forEach>
		</tbody>

	</table>
	</div>

</body>
</html>