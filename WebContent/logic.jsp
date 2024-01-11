<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>测试logic标签(empty,notempty,present,notpresent)</h1>
	<hr>
	<logic:empty name="attr1">
	    attr1为空<br>
	</logic:empty>
	<logic:notEmpty name="attr1">
	    attr1不为空<br>
	</logic:notEmpty>
	<logic:present name="attr1">
	    attr1存在<br>
	</logic:present>
	<logic:notPresent name="attr1">
	    attr1不存在<br>
	</logic:notPresent>
	<p>
	<logic:empty name="attr2">
	    attr2为空<br>
	</logic:empty>
	<logic:notEmpty name="attr2">
	    attr2不为空<br>
	</logic:notEmpty>
	<logic:present name="attr2">
	    attr2存在<br>
	</logic:present>
	<logic:notPresent name="attr2">
	    attr2不存在<br>
	</logic:notPresent>
	<p>
	<logic:empty name="attr3">
	    attr3为空<br>
	</logic:empty>
	<logic:notEmpty name="attr3">
	    attr3不为空<br>
	</logic:notEmpty>
	<logic:present name="attr3">
	    attr3存在<br>
	</logic:present>
	<logic:notPresent name="attr3">
	    attr3不存在<br>
	</logic:notPresent>
	<p>
</body>
</html>