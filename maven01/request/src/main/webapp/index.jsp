<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/15
  Time: 下午 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登入</h1>
<div>
    <form action="${pageContext.request.contextPath}/login" method="POST">
        用戶: <input type="text" name="username"><br>
        密碼: <input type="password" name="password"><br>
        愛好:
        <input type="checkbox" name="hoppies" value="女生">女生
        <input type="checkbox" name="hoppies" value="吃飯">吃飯
        <input type="checkbox" name="hoppies" value="電動">電動
        <input type="checkbox" name="hoppies" value="爆炸">爆炸
        <input type="submit">
        <br>
    </form>
</div>

</body>
</html>
