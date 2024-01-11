<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>测试html标签</h1>
	<hr>

	<html:form action="login.do" method="post">
		username:<html:text property ="username"><br>
		password: <html:password property ="password"><br>
		<html:submit type="submit" value="login">
	</html:form>
</body>
</html>