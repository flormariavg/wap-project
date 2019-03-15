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
	<form action="loginServlet" method="post">
		<div>
			<label>User</label> <input name="user" value="${cookie.username.value}" required />
		</div>
		<div>
			<label>Password</label> <input type="password" name="password"
				required />
		</div>

		<input type="checkbox"
			<c:if test="${cookie.containsKey('username')}">checked</c:if>
			name="remember" checked="checked"><br /> 
		
		<input type="submit" value="login" />

	</form>
	

</body>
</html>
