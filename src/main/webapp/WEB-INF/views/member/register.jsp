<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style type="text/css">
	#Con {
		margin-left: 700px;
	}
</style>
</head>
<body>
	<c:import url="../default/header.jsp" />
	<div id="Con">
		<h1>회원등록</h1>
		<form action="join" method="post">
			<table border="1">
				
				<tr>
					<td><input type="text" name="id" placeholder="아이디"></td>
				</tr>
				<tr>
					<td><input type="text" name="pw" placeholder="비밀번호"></td>
				</tr>
				<tr>
					<td><input type="text" name="addr" placeholder="주소"></td>
				</tr>
				<tr>
					<td><input type="submit" value="회원가입"></td>
				</tr>
				
				
			</table>
		</form>	
	</div>
	<c:import url="../default/footer.jsp" />
</body>
</html>