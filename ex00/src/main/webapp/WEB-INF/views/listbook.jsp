<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>booklist</title>
</head>
<body>
 <table border="1" >
    <caption><strong>도서정보</strong></caption>
   <tr>
   <td>번호</td> 
   <td>이미지</td>
   <td>책고유번호</td>
   <td>제목</td>
   <td>저자</td>
   <td>출판사</td>
   <td>가격</td>
   </tr>
   <c:forEach var="ho" items="${booklist}">
   <tr>
   <td>*</td>
   <td><img src="http://localhost:8080/web/resources/image/${ho.image}"width="120" height="90"></td>
   <td>${ho.booknum}</td>
   <td><a href="/web/readbook?booknum=${ho.booknum}"> ${ho.bookname}</a></td>
   <td>${ho.writer}</td>
   <td>${ho.publisher}</td>
   <td>${ho.price}</td>
   
   </c:forEach>
</table>
<input type="button" value="도서등록하러가기"
onClick="location.href='<c:url value="/addbook" />'">
	<input type="button" value="홈으로"
onClick="location.href='<c:url value="/main" />'">
</body>
</html>