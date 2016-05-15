<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	$(function() {
		var form = $("#addArticleForm")
		var now = new Date();
		var myDate = now.toLocaleDateString();
		form.off();
		form.on("submit", function() {
			form.ajaxSubmit(function() {
				alert("添加成功");
			});
			return false;
		});
	});
</script>
<h1>信息发布</h1>
<hr>
<form action="addArticle.action" method="post" id="addArticleForm">
	信息标题：<input type="text" name="title" /><br /> 信息作者：<input type="text"
		name="name" /><br /> 所属栏目：<select>
		<option value="">---------请选择---------</option>
		<c:forEach items="${list}" var="c">
			<option value="">${c.name}</option>
		</c:forEach>
	</select> <br> 信息内容：
	<textarea rows="s" cols="20" name="content"></textarea>
	时间：<b id = "alterdate"></b>
	<br /> <input type="submit" value="发布" />
</form>
<script language="JavaScript">
	var isnMonth = new Array("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月",
			"9月", "10月", "11月", "12月");
	var isnDay = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六",
			"星期日");
	today = new Date();
	Year = today.getFullYear();
	Date = today.getDate();
	//if (document.all)
	document.getElementById('test').innerHTML = "今天是: " + Year + "年"
			+ isnMonth[today.getMonth()] + Date + "日" + isnDay[today.getDay()]
</script>