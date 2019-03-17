<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/store.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  Free CSS Templates from www.templatemo.com -->
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a href="login.jsp" class="current">Login</a></li>
				<li><a href="subpage.html">Home</a></li>
				<li><a href="subpage.html">Search</a></li>
				<li><a href="subpage.html">New Releases</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- end of menu -->

		<div id="templatemo_header">
			<div id="templatemo_special_offers">
				<p>
					<span>25%</span> discounts for purchase over $80
				</p>
				<a href="subpage.html" style="margin-left: 50px;">Read more...</a>
			</div>


			<div id="templatemo_new_books">
				<ul>
					<li>Suspen disse</li>
					<li>Maece nas metus</li>
					<li>In sed risus ac feli</li>
				</ul>
				<a href="subpage.html" style="margin-left: 50px;">Read more...</a>
			</div>
		</div>
		<!-- end of header -->

		<div id="templatemo_content">

			<div id="templatemo_content_right_ShoppingCart">

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
	
			    <img id="loader" style="display:none;" alt="loader img" src="images/loader.gif"/>
				<button id="btn_proceed_checkout" type="button" class="button-checkout">Proceed</button>
				<br>
			


			</div>
			<!-- end of content left -->


		
			<div id="templatemo_content_left_ShoppingCart">
				<div id="div1">
			<p class="border-bottom left">
				<strong>1. Shipping Address</strong>
			</p>
			<table>
				<tr>
					<td>Name:</td>
					<td><input id="name"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input name="address"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input name="city"></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input name="state"></td>
				</tr>
				<tr>
					<td>ZipCode:</td>
					<td><input name="zipcode"></td>
				</tr>
			</table>

			<p class="border-bottom left">
				<strong>2. Payment Method</strong>
			</p>
			<table>
				<tr>
					<label><input type="radio" name="payment" value="credit">
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
			<p class="border-bottom left">
				<strong>3. Billing Address</strong>
			</p>
			<table>
				<tr>
					<td>Name:</td>
					<td><input name="namebill"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input name="addressbill"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input name="citybill"></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input name="statebill"></td>
				</tr>
				<tr>
					<td>ZipCode:</td>
					<td><input name="zipcodebill"></td>
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