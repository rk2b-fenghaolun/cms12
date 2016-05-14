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
<h1>学生管理</h1>
<hr>
<table border="1"
	style="width: 100%; border-collapse: collapse; margin-top: 10px">
	<tr>
		<th>编号</th>
		<th>学生姓名</th>
		<th>学生学号</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${studentlist}" var="s">
	<tr>
	<td><input type = "checkbox" value="${s.id} }"/></td>
		<td><a>${s.name}</a></td>       	
		<td><a>${s.number}</a></td> 
		<td>
		<a href="javascript:void(0);" val="${s.id}" class="update">修改</a> 
		<a href="javascript:void(0);" val="${s.id}" class="delete">删除</a></td>	
	</tr>
	</c:forEach>
</table>
<script>
$(function(){
	var url = "deleteStudent.action";
	$(".delete").off();
	$(".delete").on("click",function(){
		var id=$(this).attr("val");
		var flag = confirm("确认删除吗?");
		if(flag){
			$.post(url,{id:id},function(){
				//模拟点击“栏目管理”
				$(".baseUI li:contains('学生管理')").trigger("click");
			});
		}
	});
});
</script>