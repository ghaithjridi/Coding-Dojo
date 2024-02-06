<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/books">Back to dash</a>
	<table>
		<thead>
			<tr>
				<td class="float-left">Title:</td>
				<td class="float-left"><c:out value="${book.title}"></c:out></td>
			</tr>
			<tr>
				<td class="float-left">publisher:</td>
				<td class="float-left"><c:out value="${book.publisher.name}"></c:out></td>
			</tr>
			<tr>
				<td class="float-left">pages (1-10):</td>
				<td class="float-left"><c:out value="${book.pages}"></c:out></td>
			</tr>
		</thead>
	</table>
	<a href="/books/edit/${book.id }">Edit</a>
	<form action="/books/${oneBook.id}" method="post">
		<input type="hidden" name="_method" value="delete"> <input
			type="submit" value="Delete">
	</form>

</body>
</html>