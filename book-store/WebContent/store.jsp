<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>Book Store</h1>
		<a href="<c:url value="/login.jsp"></c:url>">Login</a>
		<table>
			<thead>
				<tr>
					<th></th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="item">
					<tr>
						<td></td>
						<td>${item.name}</td>
						<td>${item.description}</td>
						<td>${item.unitPrice}</td>
						<td><a href="<c:url value="/addItem"><c:param name="item" value="${item.code}" /></c:url>">Add Cart</a></td>
						
						
					</tr>
				</c:forEach>
		</table>
		<a href="<c:url value="/cart"></c:url>">Cart</a>
	</div>


</body>
</html>