<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/17
  Time: 上午 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>If 測試</h4>
<form action="coreif.jsp">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="login">
</form>

<c:if test="${param.username == 'admin'}" var="isAdmin">
    <c:out value="歡迎管理員"></c:out>
</c:if>
<c:out value="${isAdmin}"></c:out>
</body>
</html>
