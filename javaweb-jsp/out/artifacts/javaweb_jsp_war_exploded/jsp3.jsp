<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/16
  Time: 下午 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--編譯後合2為1--%>
    <%@include file="common/header.jsp"%>
    <h2>冬瓜</h2>
    <%@include file="common/footer.jsp"%>
    <hr>
<%--編譯後依然各自獨立每個頁面藉由導入--%>
    <jsp:include page="/common/header.jsp"/>
    <h1>網頁主體</h1>
    <jsp:include page="/common/footer.jsp"/>
</body>
</html>
