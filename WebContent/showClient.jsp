<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead style="text-align: center;font-size:30px">显示用户信息</thead>
		<tr><td>编号</td><td>姓名</td><td>电话</td><td>地址</td><td>押金</td><td>预定桶数</td><td>开始日期</td></tr>
		<c:forEach	items="listClient" var="client">
			<tr>
				<td>${client.clientId}</td>
				<td>${client.clientName}</td>
				<td>${client.tel}</td>
				<td>${client.address }</td>
				<td>${client.foregift }</td>
				<td>${client.bucketCnt }</td>
				<td>${client.startDate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>