<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>测试Struts上传</h1>
    <hr>
    <p>
    <form action="upload.do" method="post" enctype="multipart/form-data">
        标题：<input type="text" name="title"><br>
        文件：<input type="file" name="myfile" ><br>
        <input type="submit" value="提交"><br>
    </form>
</body>
</html>