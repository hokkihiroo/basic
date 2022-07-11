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
<form action="registerbook" method="post"enctype="multipart/form-data">
 <table border="1" >
    <caption><strong>도서정보관리 도서추가</strong></caption>
    <tr>
        <td colspan="3">*표시는 필수로 적어주세요</td>
    </tr>
    <tr>
        <td rowspan="6">이미지</td>
        <td><strong>*BOOK ISBN</strong></td>
        <td><input type="text" name="booknum"/></td>
    </tr>
   
    <tr>
       <td><strong>*도서명</strong></td>
       <td><input type="text"name="bookname" /></td>
    </tr>
    <tr>
       <td><strong>*저자</strong></td>
        <td><input type="text"name="writer" /></td>
    </tr>
      <tr>
       <td><strong>*출판사</strong></td>
        <td><input type="text"name="publisher" /></td>
    </tr>
     <tr>
       <td><strong>*도서가격</strong></td>
        <td><input type="text" name="price"/></td>
    </tr>
     <tr>
       <td><strong>*이미지</strong></td>
        <td><input type="file" name="image"/></td>
    </tr>
   <tr>
         <td><strong>*책소개</strong></td>
         <td colspan="2"><textarea cols="50" rows="10"name="introduce"></textarea></td>
    </tr>
   
</table>
<input type="button" value="리스트보기" 
onClick="location.href='<c:url value="/listbook" />'">
	<input type="submit" value="저장하기">
</form>

</body>
</html>