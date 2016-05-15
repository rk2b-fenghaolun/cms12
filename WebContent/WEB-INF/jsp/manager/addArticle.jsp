<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
	$(function(){
		var form = $("#addArticleForm")
		var now=new Date();
        var myDate = now.toLocaleDateString();
		form.off();
		form.on("submit",function()
		{
			form.ajaxSubmit(function(){
			alert("添加成功");
		    });
	        return false;
		});
	});
</script> 
<h1>信息发布</h1>
<hr>
<form action="addArticle.action" method="post" id="addArticleForm">
	信息标题：<input type="text" name="title"/><br/>
	信息作者：<input type="text" name="name"/><br/>
	所属栏目：<select>
	<option value="">---------请选择---------</option>
	<c:forEach items="${list}" var = "c">
	<option value="">${c.name}</option>
	</c:forEach>
	</select>
	<br>
	信息内容：<textarea rows="s" cols="20" name="content" ></textarea><br/>
	
	<input type="submit" value="发布"/>
</form>