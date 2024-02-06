<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

		<a href="/logout">Logout</a><br> <a href="/books/new">Add a
			to my shelf</a>

		<h1>Books for everyone's shelves</h1>

		<!-- 		Display all Books -->
		<%-- 		${allBooks  } --%>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>

					<th>Posted BY</th>
					<th>Pages</th>
					<th>author Name</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allBooks }" var="oneBook">
					<tr>
						<td>${oneBook.id}</td>
						<td><a href="/books/${oneBook.id}"><c:out
									value="${oneBook.title}"></c:out></a></td>
						<td>${oneBook.author.userName}</td>
						<td>${oneBook.pages}</td>
						<td>${oneBook.publisher.name}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>

	</div>
</body>
</html>