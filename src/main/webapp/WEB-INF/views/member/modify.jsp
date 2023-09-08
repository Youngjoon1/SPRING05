<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#Con {
		text-align: center;
	}
</style>
</head>
<body>
	<c:import url="../default/header.jsp" />
	<div id="Con">
		<h1>회원수정</h1>
		<form action="userModify" method="post">
			<input type="text" value="${info.id}" name="id" readonly><br>
			<input type="text" value="${info.pw}" name="pw"><br>
			<input type="text" value="${info.addr}" name="addr"><br>
			<input type="submit" value="수정">
		</form>
	</div>
	<c:import url="../default/footer.jsp" />
</body>
</html>