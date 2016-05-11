<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>添加学生</h1>
<hr>
<form action="addStudent.action" method="post">
	学生姓名：<input type="text" name="name"/><br/>
	学生号：<input type="text" name="number"/><br/>
	<input type="submit" value="添加"/>
</form>