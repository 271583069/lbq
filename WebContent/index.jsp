<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<body>
${msg}
<form action="u!dl.action">
账号：<input type="text" name="u.username" id="username"><br>
密码：<input type="text" name="u.userpwd" id="userpwd"><br>
<input type="submit" value="确认">
<a href="save.jsp">注册</a>
</form>
</body>
</html>