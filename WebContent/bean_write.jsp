<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>测试beanwrite标签</h1>
	<hr>
	<li>普通字符串</li>
	hello（标签）：<bean:write name="hello"/><br>
	<p></p>
	html 文本(defalut)：<bean:write name="htmlText"/><br>
	html 文本(filter=false)：<bean:write filter="false" name="htmlText"/><br>
	<li>格式化日期</li>
	<p></p>
	系统时间(default)：<bean:write name="today"/><br>
	系统时间(format)：<bean:write name="today" format="yyyy-MM-dd HH:mm:ss"/><br>
	<li>格式化数字</li>
	<p></p>
	数值(default)：<bean:write name="n"/><br>
	数值(format)：<bean:write name="n" format="###,###.00000#"/><br>
	<li>javabean</li>
	<p></p>

	姓名：<input type="text" name="username" value="<bean:write name="user" property="username"/>"><br>
	年龄：<input type="text" name="age" value="<bean:write name="user" property="age"/>"><br>
	分组：<input type="text" name="groupname" value="<bean:write name="user" property="group.name"/>"><br>
	
</body>
</html>