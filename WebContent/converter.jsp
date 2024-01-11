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
	<h1>测试Struts的类型转换器</h1>
	<hr>
	<form action="type_convert.do" method="post">
		intValue:<input type="text" name ="intValue"><br>
		doubleValue:<input type="text" name ="doubleValue"><br>
		booleanValue:<input type="text" name ="booleanValue"><br>
		java.sql.Date:<input type="text" name ="sqlDate"><br>
		java.util.Date:<input type="text" name ="utilDate"><br>
		<input type="submit" value="提交" >
	</form>
</body>
</html>