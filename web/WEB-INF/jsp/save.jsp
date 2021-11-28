<%--
  Created by IntelliJ IDEA.
  User: ding
  Date: 2021/11/28
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>保存Person信息表单</h1>
<form action="${pageContext.request.contextPath}/person/save">
    名称:<input type="text" name="name"><br>
    年龄:<input type="text" name="age"><br>
    <button type="submit">提交</button>
</form>
</body>
</html>