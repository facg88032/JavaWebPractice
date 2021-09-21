<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/17
  Time: 上午 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>1</h1>
<jsp:forward page="/jsptag2.jsp">
    <jsp:param name="name" value="aaa"/>
    <jsp:param name="age" value="12"/>
</jsp:forward>


</body>
</html>
