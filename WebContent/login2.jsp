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
	<logic:notEmpty name="msg">
	    <font color="red"> <bean:write name="msg"/></font>
	</logic:notEmpty>
	<form action="login.do" method="post">
		<bean:message key="login.form.filed.username"/>:<input type="text" name ="username"><br>
		<bean:message key="login.form.filed.password"/>: <input type="password" name ="password"><br>
		<input type="submit" value="<bean:message key="login.form.button.login"/>">
	</form>

</body>
</html>