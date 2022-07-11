<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	도서관리프로그램 
	
</h1>

<P>  현재시각은  ${serverTime}입니다 . </P>

<input type="button" value="도서등록하기"
onClick="location.href='<c:url value="/addbook" />'">
<input type="button" value="도서목록보기"
onClick="location.href='<c:url value="/listbook" />'">

</body>
</html>
