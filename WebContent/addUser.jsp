<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%-- <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%> --%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<html:errors/>
	<form action="addUser.do" method="post">
		username:<input type="text" name ="username"><br>
		password: <input type="password" name ="password"><br>
		<input type="submit" value="添加">
	</form>

</body>
</html>