<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/store.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img id="loader" class="loader" alt="loader img"
		src="images/loader-dots.gif" width="80px" />
	<div id="result" class="result">
		<label id="msg"></label>
	</div>
	<!--  Free CSS Templates from www.templatemo.com -->
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a id="loginId" href=${urlLogin } class="current">${btnLogin}</a></li>
				<li><a href="store">Home</a></li>
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

			<div id="templatemo_content_left">

				<div class="templatemo_content_left_section">
					<h1>Bestsellers</h1>
					<ul>
						<li><a href="#">1. Vestibulum ullamcorper</a></li>
						<li><a href="#">2. Maece nas metus</a></li>
						<li><a href="#">3. In sed risus ac feli</a></li>
						<li><a href="#">3. Praesent mattis varius</a></li>
						<li><a href="#">4. Maece nas metus</a></li>
						<li><a href="#">5. In sed risus ac feli</a></li>
						<li><a href="#">6. Flash Templates</a></li>
						<li><a href="#">7. CSS Templates</a></li>
						<li><a href="#">8. Web Design</a></li>
						<li><a href="#">9. Web Programming</a></li>
						<li><a href="#">10.Big Data</a></li>
					</ul>
				</div>

				<div class="templatemo_content_left_section">
					<a href="http://validator.w3.org/check?uri=referer"><img
						style="border: 0; width: 88px; height: 31px"
						src="http://www.w3.org/Icons/valid-xhtml10"
						alt="Valid XHTML 1.0 Transitional" width="88" height="31"
						vspace="8" border="0" /></a> <a
						href="http://jigsaw.w3.org/css-validator/check/referer"><img
						style="border: 0; width: 88px; height: 31px"
						src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
						alt="Valid CSS!" vspace="8" border="0" /></a>
				</div>
			</div>
			<!-- end of content left -->


			<div class="store">
				<label class="store"> <a class="store"
					href="<c:url value="/cart"></c:url>"><img class="store"
						src="images/cart.png" alt="image" />Cart</a>
				</label>
			</div>
			<div id="templatemo_content_right">
				<c:forEach items="${products}" var="item">
					<div class="templatemo_product_box">
						<h1>
							${item.name} <br>
							<span>${item.author}</span>
						</h1>
						<img src=${item.image } alt="image" />
						<div class="product_info">
							<p>${item.description}</p>
							<h3>${item.unitPrice}</h3>
							<div class="buy_now_button">
								<a onclick="addToCart('${item.code}')">Add Cart</a>
							</div>

						</div>
						<div class="cleaner">&nbsp;</div>
					</div>

					<div class="cleaner_with_width">&nbsp;</div>
					<div class="cleaner_with_height">&nbsp;</div>
				</c:forEach>

				<div class="cleaner_with_height">&nbsp;</div>

				<a href="subpage.html"><img src="images/templatemo_ads.jpg"
					alt="ads" /></a>
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