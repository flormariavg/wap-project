<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  Free CSS Templates from www.templatemo.com -->
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a href="index.html" class="current">Login</a></li>
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

			<div id="templatemo_content_left" class="shopping_cart">
				<!-- end of content left -->

				<table>
					<c:forEach items="${shoppingCart.products}" var="product">
						<div class="templatemo_product_box">

							<h1>
								<%-- ${item.name} <span>${item.author}</span> --%>
								${product.item.name}
							</h1>
							<img src="${product.item.image}" alt="image" />
							<div class="product_info">
								<h3>${product.item.unitPrice}</h3>
								<h3>${product.quantity}</h3>
								<div class="buy_now_button">
									<button onclick="">Delete</button>
								</div>
							</div>
				</table>
				<div class="cleaner">&nbsp;</div>
			</div>

			<div class="cleaner_with_width">&nbsp;</div>
			<div class="cleaner_with_height">&nbsp;</div>
			</c:forEach>

			<div id="templatemo_content_left" class="shopping_cart">
				<h1>Subtotal</h1>
				<h3>Total Items: ${shoppingcart.totalItems}</h3>
				<h3>Books Price: ${product.calculatedTotalPrice}</h3>
				<div class="buy_now_button">
					<button onclick="">Proceed to checkout</button>
				</div>
			</div>

		</div>

		<!-- end of content right -->
		<div class="cleaner_with_height">&nbsp;</div>
		<div class="templatemo_content_left_section">
			<a href="http://validator.w3.org/check?uri=referer"><img
				style="border: 0; width: 88px; height: 31px"
				src="http://www.w3.org/Icons/valid-xhtml10"
				alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8"
				border="0" /></a> <a
				href="http://jigsaw.w3.org/css-validator/check/referer"><img
				style="border: 0; width: 88px; height: 31px"
				src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
				alt="Valid CSS!" vspace="8" border="0" /></a>
		</div>
		<div id="templatemo_footer">

			<a href="subpage.html">Home</a> | <a href="subpage.html">Search</a> |
			<a href="subpage.html">Books</a> | <a href="#">New Releases</a> | <a
				href="#">FAQs</a> | <a href="#">Contact Us</a><br /> Copyright ©
			2019 <a href="#"><strong>Group 4 - Web Programming</strong></a>
			<!-- Credit: www.templatemo.com -->
		</div>
	</div>
	<!-- end of content -->


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