<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
th {
	background: lightblue;
}

td {
	text-align: center; /*设置水平居中*/
	vertical-align: middle; /*设置垂直居中*/
	font-family: 微软雅黑;
	font-size: 18;
}
</style>
<h1>栏目管理</h1>
<hr>
<table border="1"
	style="width: 100%; border-collapse: collapse; margin-top: 10px">
	<tr>
		<th>编号</th>
		<th>栏目名称</th>
		<th>栏目编号</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${list}" var="c">
	<tr>
	<td><input type = "checkbox" value="${c.id} }"/></td>
		<td><a>${c.name}</a></td>       	
		<td><a>${c.code}</a></td> 
		<td><a href="">修改</a> <a href="deleteCategory.action?id=${c.id}">删除</a></td>
		
	</tr>
	</c:forEach>
</table>