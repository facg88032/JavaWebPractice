<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/16
  Time: 下午 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //透過尋找方式查找
    //從底往上找(作用域)
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>
<h1>P2</h1>
<h2>取出的值為</h2>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>
<h3><%=name5%></h3>
</body>
</html>
