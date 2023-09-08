<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#Con{
		text-align: center;
	}	
</style>
</head>
<body>

	<c:import url="../default/header.jsp" />
	<div id="Con">
		<h1>${info.id} 정보</h1><br>
		<b>아이디 : ${info.id}</b><br>
		<b>비밀번호 : ${info.pw}</b><br>
		<b>주소 : ${info.addr}</b><br>
		<a href="modify?id=${info.id}">수정하기</a><br>
		<a href="userDel?id=${info.id}">삭제하기</a><br>
		<a href="index">메인가기</a>
	</div>
	<c:import url="../default/footer.jsp" />

</body>
</html>