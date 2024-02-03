<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>
	<h1>${dojo.name }</h1>

	<ul>
		<c:forEach items="${dojo.ninjas }" var="oneNinja">
			<li>${oneNinja.firstName }</li>
			<li>${oneNinja.lastName }</li>
			<li>${oneNinja.age }</li>

		</c:forEach>
	</ul>

</body>
</html>