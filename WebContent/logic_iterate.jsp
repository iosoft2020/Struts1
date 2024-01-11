<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>测试logic迭代标签</h1>
	<hr>

	<table border="1">
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>所属组</td>
		</tr>
		<logic:empty name="users">
			<tr>
				<td colspan="3">没有符合条件的数据</td>
			</tr>
		</logic:empty>
		<logic:notEmpty name="users">
			<logic:iterate id="user" name="users">
				<tr>
					<td>
						<bean:write name="user" property="username"/>
					</td>
					<td>
						<bean:write name="user" property="age"/>
					</td>
					<td>
						<bean:write name="user" property="group.name"/>
					</td>
				</tr>
			</logic:iterate>
		</logic:notEmpty>
	</table>
</body>
</html>