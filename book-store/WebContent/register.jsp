<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/register.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img id="loader" class="loader" alt="loader img" src="images/loader-dots.gif" width="80px"/>
	<div id="result" class="result">
		<label id="msg"></label>
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

			<div id="templatemo_content_left_ShoppingCart">
				<br>
				<div id="div1">
					<p class="border-bottom left">
						<strong>Registration</strong>
					</p>
					<table class="table_ckeckout">
						<tr>
							<td>Username:</td>
							<td><input name="username"></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td>Firstname:</td>
							<td><input name="firstname"></td>
						</tr>
						<tr>
							<td>Lastname:</td>
							<td><input name="lastname"></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><input name="email"></td>
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
							<td>Country:</td>
							<td><input name="country"></td>
						</tr>
						<tr>
							<td>ZipCode:</td>
							<td><input name="zipcode"></td>
						</tr>
						<tr>
							<td>Phone number:</td>
							<td><input name="phonenumber"></td>
						</tr>
					</table>
					<br>
					<p class="border-bottom left">
						<strong>Prefered Payment Method</strong>
					</p>
					<table class="table_ckeckout">
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
					<br>
					<p class="border-bottom left">
						<strong>Billing Address</strong>
					</p>
					<table class="table_ckeckout">
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
							<td>Country:</td>
							<td><input name="countrybill"></td>
						</tr>
						<tr>
							<td>ZipCode:</td>
							<td><input name="zipcodebill"></td>
						</tr>
						<tr>
							<td>Phone number:</td>
							<td><input name="phonenumberbill"></td>
						</tr>
					</table>
				</div>
				<button id="btn_register" type="button"
					class="button-checkout">Register</button>

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