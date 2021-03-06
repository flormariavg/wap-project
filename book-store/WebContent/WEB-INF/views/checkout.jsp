<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/checkout.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img id="loader" class="loader" alt="loader img" src="images/loader-dots.gif" width="80px"/>
	<div id="result" class="result">
		<label id="msg">${message}</label>
	</div>
	<!--  Free CSS Templates from www.templatemo.com -->
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a id="loginId" href=${urlLogin } class="current">${btnLogin}</a></li>
				<li><a href="store">Home</a></li>
				<li><a href="register.jsp">Register</a></li>
			</ul>
		</div>
		<!-- end of menu -->

		<div id="templatemo_header">
			<div id="templatemo_special_offers">
				<p>
					<span>25%</span> discounts for purchase over $80
				</p>
			</div>


			<div id="templatemo_new_books">
				<ul>
					<li>Suspen disse</li>
					<li>Maece nas metus</li>
					<li>In sed risus ac feli</li>
				</ul>
			</div>
		</div>
		<!-- end of header -->

		<div id="templatemo_content">

			<div id="templatemo_content_right_ShoppingCart">
				<br>
				<div id="div2">
					<p class="border-bottom">
						<strong>Order confirmation</strong>
					</p>
					<table>
						<tr>
							<td>Products:</td>
							<td><label class="label-checkout" name="totalproducts">${shoppingCart.totalPrice}</label></td>
						</tr>
						<tr>
							<td>Shipping:</td>
							<td><label class="label-checkout" name="shipping">${shoppingCart.shipping}</label></td>
						</tr>
					</table>


					<p class="border-bottom">
						<strong>Total of the order</strong>
					</p>
					<table>
						<tr>
							<td>Total:</td>
							<td><label class="label-checkout" name="totalall">${shoppingCart.total}</label></td>
						</tr>
					</table>
				</div>
				<button id="btn_proceed_checkout" type="button"
					class="button-checkout">Proceed</button>

				<br>
			</div>
			<!-- end of content left -->

			<div id="templatemo_content_left_ShoppingCart">
				<br>
				<div id="div1">
					<p class="border-bottom left">
						<strong>1. Shipping Address</strong>
					</p>
					<table class="table_ckeckout">
						<tr>
							<td>Name:</td>
							<td><input name="name" required="required" value="${shoppingCart.user.person.firstName} ${shoppingCart.user.person.lastName}"></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><input name="address" required="required" value="${shoppingCart.user.person.address.addressLine}"></td>
						</tr>
						<tr>
							<td>City:</td>
							<td><input name="city" required="required" value="${shoppingCart.user.person.address.city}"></td>
						</tr>
						<tr>
							<td>State:</td>
							<td><input name="state" required="required" value="${shoppingCart.user.person.address.state}"></td>
						</tr>
						<tr>
							<td>Country:</td>
							<td><input name="country" required="required" value="${shoppingCart.user.person.address.country}"></td>
						</tr>
						<tr>
							<td>ZipCode:</td>
							<td><input name="zipcode" required="required" value="${shoppingCart.user.person.address.zipCode}"></td>
						</tr>
						<tr>
							<td>Phone number:</td>
							<td><input name="phonenumber" required="required" value="${shoppingCart.user.person.address.phoneNumber}"></td>
						</tr>
					</table>
					<br>
					<p class="border-bottom left">
						<strong>2. Payment Method</strong>
					</p>
					<table class="table_ckeckout" >
						<tr>
							<label><input type="radio" name="payment" value="credit" checked="checked">
								CreditCard</label>
							<br>
						</tr>
						<tr>
							<label><input type="radio" name="payment" value="debit">
								DebitCard</label>
							<br>
						</tr>
						<tr>
							<label><input type="radio" name="payment" value="other">
								Other</label>
						</tr>
					</table>
					<br>
					<p class="border-bottom left">
						<strong>3. Billing Address</strong>
					</p>
					<table class="table_ckeckout">
						<tr>
							<td>Name:</td>
							<td><input name="namebill" required="required" value="${shoppingCart.user.person.firstName} ${shoppingCart.user.person.lastName}"></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><input name="addressbill" required="required" value="${shoppingCart.user.billingAddress.addressLine}"></td>
						</tr>
						<tr>
							<td>City:</td>
							<td><input name="citybill" required="required" value="${shoppingCart.user.billingAddress.city}"></td>
						</tr>
						<tr>
							<td>State:</td>
							<td><input name="statebill" required="required" value="${shoppingCart.user.billingAddress.state}"></td>
						</tr>
						<tr>
							<td>Country:</td>
							<td><input name="countrybill" required="required" value="${shoppingCart.user.billingAddress.country}"></td>
						</tr>
						<tr>
							<td>ZipCode:</td>
							<td><input name="zipcodebill" required="required" value="${shoppingCart.user.billingAddress.zipCode}"></td>
						</tr>
						<tr>
							<td>Phone number:</td>
							<td><input name="phonenumberbill" required="required" value="${shoppingCart.user.billingAddress.phoneNumber}"></td>
						</tr>
					</table>
				</div>


				<div class="cleaner_with_height">&nbsp;</div>

			</div>
			<!-- end of content right -->

			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<!-- end of content -->

		<div id="templatemo_footer">

			<a href="subpage.html">Home</a> | <a href="subpage.html">Search</a> |
			<a href="subpage.html">Books</a> | <a href="#">New Releases</a> | <a
				href="#">FAQs</a> | <a href="#">Contact Us</a><br /> Copyright ©
			2019 <a href="#"><strong>Group 4 - Web Programming</strong></a>
			<!-- Credit: www.templatemo.com -->
		</div>
		<!-- end of footer -->
		<!--  Free CSS Template www.templatemo.com -->
	</div>
	<!-- end of container -->
	<!-- templatemo 086 book store -->
	<!-- 
Book Store Template 
http://www.templatemo.com/preview/templatemo_086_book_store 
-->
</body>
</html>