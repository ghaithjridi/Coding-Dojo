<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
    
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<h1 class="text-danger">Fruits List:</h1>
<table class="table">
 <thead>
    <tr>
      <th scope="col">name</th>
      <th scope="col">price</th>
      
    </tr>
  </thead>
  <tbody>
  
  <c:forEach var="oneFruits" items="${fruitsController}" >
  <tr>
        <td><c:out value="${oneFruits.name}"></c:out></td>
        <td><c:out value="${oneFruits.price}"></c:out></td>
   </c:forEach>
   </tr>
  
  </tbody>
  
  
    
    </table>

</body>
</html>