	<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	intValue:${typeConvertForm.intValue }<br>
	doubleValue:${typeConvertForm.doubleValue }<br>
	booleanValue:${typeConvertForm.booleanValue }<br>
	java.sql.Date:${typeConvertForm.sqlDate }<br>
	java.util.Date:${typeConvertForm.utilDate } <font color="red">←自定义转换器，转换的内容</font>
</body>
</html>