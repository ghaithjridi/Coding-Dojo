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
</head>
<body>

<h1>Update a Burger</h1>
	<!-- 		Update a Book Form -->
	<form:form action="/burgers/${burger.id }" method="post" modelAttribute="burger">
		<input type="hidden" name="_method" value="put">
		<form:errors path="*" />
		<p>
			<form:label path="burgername">burgername</form:label>

			<form:input path="burgername" />
		</p>
		<p>
			<form:label path="restaurantname">restaurantname</form:label>

			<form:input path="restaurantname" />
		</p>

		<p>
			<form:label path="ratting">ratting</form:label>

			<form:input type="number" path="ratting" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>