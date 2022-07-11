<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>repair</title>
</head>
<body>
<form action="repairok" method="post">
 <table border="1" >
    <caption><strong>도서정보</strong></caption>
   
    <tr>
        <td rowspan="5">이미지</td>
        <td><strong>BOOK ISBN</strong></td>
        <td><input type='hidden' name='booknum' value="${bookvo.booknum}">${bookvo.booknum}</td>
    </tr>
   
    <tr>
       <td><strong>도서명</strong></td>
       <td><input type="text" name="bookname" placeholder="${bookvo.bookname}"></td>
    </tr>
    <tr>
       <td><strong>저자</strong></td>
        <td><input type="text" name="writer" placeholder="${bookvo.writer}"></td>
    </tr>
      <tr>
       <td><strong>출판사</strong></td>
        <td><input type="text" name="publisher" placeholder="${bookvo.publisher}"></td>
    </tr>
     <tr>
       <td><strong>금액</strong></td>
        <td><input type="text" name="price" placeholder="${bookvo.price}"></td>
    </tr>
    
   <tr>
         <td><strong>책소개</strong></td>
         <td colspan="2"> <textarea cols="50" rows="10"name="introduce" placeholder="${bookvo.introduce}"></textarea> </td>
    </tr>
   
</table>
	
<input type="submit" value="수정완료 ">
<input type="button" value="목록으로 돌아가기" 
onClick="location.href='<c:url value="/listbook" />'">
</form>
</body>
</html>