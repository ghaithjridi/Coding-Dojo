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
	<a href="/books">Back to dash</a>

	
		<!-- 		Create a Book Form -->
		<form:form action="/books/processBook" method="post"
			modelAttribute="book">
			<form:errors path="*" />
			<p>
				<form:label path="title">Title</form:label>

				<form:input path="title" />
			</p>
			<!-- 			<p> -->
			<%-- 				<form:label path="author">Author</form:label> --%>

			<%-- 				<form:input path="author" /> --%>
			<!-- 			</p> -->

			<p>
				<form:label path="pages">Pages</form:label>

				<form:input type="number" path="pages" />
			</p>

			<p>
				<form:label path="publisher">Publisher</form:label>

				<form:select path="publisher">
					<c:forEach items="${publishers }" var="onePublisher">
						<option value="${onePublisher.id }">${onePublisher.name }
						</option>
					</c:forEach>
				</form:select>
			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>