<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Shopping Cart</title>
	<link href="./resouces/css/store.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div >
		<table >
				<tr>
					<th>Product</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Action</th>
				</tr>
				<tr>
					<td>Product1</td>
					<td>Price1</td>
					<td>Quantity1</td>
					<td><a href="https://www.google.com">Delete</a></td>
				</tr>
				<tr>
					<td>Product2</td>
					<td>Price2</td>
					<td>Quantity2</td>
				</tr>
				<tr>
					<td>Product3</td>
					<td>Price3</td>
					<td>Quantity3</td>
				</tr>
		</table>
	</div>
	</br>
	<div id="div3">
	   <form action="/login" method="post">  
        	<button>Checkout</button><br>
    	</form>
	</div>
</body>
</html>