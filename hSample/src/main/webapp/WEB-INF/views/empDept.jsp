<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

추후에 화면 출력<hr/>

<table border='2'>

	<c:forEach items='${result}' var='dept'>
	<tr>
		<td>${dept.EMPNO}</td>
		<td>${dept.ENAME}</td>
		<td>${dept.DNAME}</td>

	</tr>
	</c:forEach>
	
</table>
</body>
</html>