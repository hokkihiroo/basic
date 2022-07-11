<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
 <table border="1" >
    <caption><strong>도서정보</strong></caption>
   
    <tr>
        <td rowspan="5">이미지</td>
        <td><strong>BOOK ISBN</strong></td>
        <td>${bookvo.booknum }</td>
    </tr>
   
    <tr>
       <td><strong>도서명</strong></td>
       <td>${bookvo.bookname}</td>
    </tr>
    <tr>
       <td><strong>저자</strong></td>
        <td>${bookvo.writer}</td>
    </tr>
      <tr>
       <td><strong>출판사</strong></td>
        <td>${bookvo.publisher}</td>
    </tr>
     <tr>
       <td><strong>금액</strong></td>
        <td>${bookvo.price}</td>
    </tr>
    
   <tr>
         <td><strong>책소개</strong></td>
         <td colspan="2">${bookvo.introduce}</td>
    </tr>
   
</table>
	

</form>
<input type="button" value="리스트보기" 
onClick="location.href='<c:url value="/listbook" />'">
<input type="button" value="수정" 
onClick="location.href='<c:url value="/repair?booknum=${bookvo.booknum}"/>'">
<input type="button" value="삭제" 
onClick="location.href='<c:url value="/delete?booknum=${bookvo.booknum}"/>'">
</body>
</html>