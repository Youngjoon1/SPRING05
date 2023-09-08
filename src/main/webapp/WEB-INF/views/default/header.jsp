<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<%--<link href="${contextPath}/css/test.css" rel="stylesheet"> --%>
<link href="resources/css/header.css" rel="stylesheet">
</head>
<body>
	<div id="careCon">
		<p id="care">CARE LAB</p>	
	</div>
	<hr>
	<div id="menu">
		<a href="index">HOME</a> &nbsp; 
		<c:choose>
			<c:when test="${user == null }">
				<a href="login">회원 정보</a> &nbsp;
				<a href="login">로그인</a>  
				
			</c:when>
			<c:otherwise>
				<a href="memberInfo">회원 정보</a> &nbsp;
				<a href="logout">로그아웃</a>
				
			</c:otherwise>
		</c:choose>
		
	</div>
	<hr>
		

</body>
</html>