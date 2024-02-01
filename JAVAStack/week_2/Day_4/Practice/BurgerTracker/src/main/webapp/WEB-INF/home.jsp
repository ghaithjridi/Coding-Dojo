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
		<h1>Burger Tracker</h1>


		<table class="table">
			<thead>
				<tr>
					<th>Burger Name</th>
					<th>Restaurant Name</th>
					<th>Ratting</th>
					<th>Actions</th>

					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allBurgers }" var="oneBurger">
					<tr>
						<td>${oneBurger.burgername}</td>
						<td>${oneBurger.restaurantname}</td>
						<td>${oneBurger.ratting}</td>
						
						<td><a href="/burgers/edit/${oneBurger.id }">Edit</a>
							<form action="/burgers/${oneBurger.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<!-- 		Create a Burger Form -->
		<form:form action="/burgers/processBurger" method="Post"
			modelAttribute="burger">
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
	</div>
</body>
</html>