<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<body>
<h2>Hello World!</h2>

<form action="${pageContext.request.contextPath}/login" method="GET">
    用戶名:<input type="text" name="username"><br>
    密碼: <input type="password" name="password"><br>
    <input type="submit">
</form>
</body>
</html>
