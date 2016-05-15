<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		var form = $("#addStudentForm")
		form.off();
		form.on("submit", function() {
			form.ajaxSubmit(function() {
				form[0].reset();
				alert("添加成功");
			});
			return false;
		});
	});
</script>
<h1>添加学生</h1>
<hr>
<form action="addStudent.action" method="post" id="addStudentForm">
	学生姓名：<input type="text" name="name" /><br /> 学生学号：<input type="text"
		name="number" /><br /> <input type="submit" value="添加" />
</form>