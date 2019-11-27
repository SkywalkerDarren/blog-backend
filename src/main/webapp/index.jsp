<%--
  Created by IntelliJ IDEA.
  User: darren
  Date: 2019/11/27
  Time: 下午3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/save" method="post">
    username:<input type="text" name="username"/><br/>
    password:<input type="password" name="password"/><br/>
    grant:<input type="text" name="grant"/><br/>
    <input type="submit" value="submit"/>
</form>
<form action="user/del" method="post">
    username:<input type="text" name="username"/><br/>
    <input type="submit" value="submit"/>
</form>
<form action="user/update" method="post">
    id:<input type="text" name="id"/><br/>
    username:<input type="text" name="username"/><br/>
    password:<input type="password" name="password"/><br/>
    grant:<input type="text" name="grant"/><br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
