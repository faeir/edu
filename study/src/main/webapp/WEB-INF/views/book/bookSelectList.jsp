<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><h1>도서 목록</h1></div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<td width="300">제목</td>
						<td width="100">저자</td>
						<td width="700">내용</td>
						<td width="100">대여</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${books }" var="book">
						<tr>
							<td>${book.bookname }</td>
							<td>${book.writer }</td>
							<td>${book.read }</td>
							<td>${book.rental }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>