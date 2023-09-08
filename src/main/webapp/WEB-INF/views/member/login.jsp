<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/login.css" rel="stylesheet">
<title>login</title>
</head>
<body>

	<c:import url="../default/header.jsp" />
	<div>
		<h1>로그인 페이지입니다</h1>
	</div>
	<div id="loginForm">
		<form action="loginCK" method="post">
			<input type="text" name="id" placeholder="아이디"><br>
			<input type="text" name="pw" placeholder="비밀번호"><br>
			<input type="submit" value="로그인"><br>
			<a href="register">회원가입</a>
		</form>
	</div>
	
	<c:import url="../default/footer.jsp" />

</body>
</html>