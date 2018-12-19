<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="u!queryByName.action" method="post">
姓名<input type="text" name="u.username">
年龄<input type="text" name="u.minage" value="0">~<input type="text" name="u.maxage">
<input type="submit" value="查询">
</form>
<table>
<tr>
	<th>员工编号</th><th>姓名</th><th>密码</th><th>年龄</th><th>操作</th>
</tr>
<c:forEach items="${list}" var="ls">
<tr>
	<td>${ls.id}</td>
	<td>${ls.username}</td>
	<td>${ls.userpwd}</td>
	<td>${ls.age}</td>
	<td>
	<a href="u!del.action?u.id=${ls.id}">删除</a>
	<a href="u!getone.action?u.id=${ls.id}">修改</a>
	</td>
	<td>
	<a href="save.jsp">添加用户</a>
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>