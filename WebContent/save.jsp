<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="u!save.action" method="post">
姓名：<input type="text" name="u.username" value="${u.username}"><br>
密码：<input type="text" name="u.userpwd" value="${u.userpwd}"><br>
年龄：<input type="text" name="u.age" value="${u.age}"><br>
<input type="submit" value="确认">
<input type="reset" value="重置">
</form>
</body>
</html>