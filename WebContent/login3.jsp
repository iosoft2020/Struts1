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
<%-- 	<logic:notEmpty name="msg"> --%>
<%-- 	    <font color="red"> <bean:write name="msg"/></font> --%>
<%-- 	</logic:notEmpty> --%>
	<html:messages id="message" message="true">
		<font color="red"><bean:write name="message"/></font>
	</html:messages>
	<html:errors/>
	<form action="login.do" method="post">
		<bean:message key="login.form.filed.username"/>:<input type="text" name ="username"><br>
		<bean:message key="login.form.filed.password"/>: <input type="password" name ="password"><br>
		<input type="submit" value="<bean:message key="login.form.button.login"/>">
	</form>

</body>
</html>