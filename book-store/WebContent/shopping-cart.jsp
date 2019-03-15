<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Shopping Cart</title>
</head>
<body>

	<div class="container">
		<h1>Shopping Cart</h1>
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
				<c:forEach items="${shoppingCart.products}" var="product">
					<tr>
						<td></td>
						<td>${product.item.description}</td>
						<td>${product.item.unitPrice}</td>
						<td></td>
						<td><button onclick="">Delete</button> </td>
						
					</tr>
				</c:forEach>
		</table>

	</div>
	</br>
	<div class="container">
		Subtotal:
		 <p> Items: ${varCount} </p>
		 <p> Value: ${varSum} </p> 
		<div>
		</br>
			<a href="<c:url value="/checkout"></c:url>">Proceed to checkout</a>
		</div>
	</div>

</body>
</html>