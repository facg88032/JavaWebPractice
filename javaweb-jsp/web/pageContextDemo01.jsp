<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/16
  Time: 下午 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    pageContext.setAttribute("name1","A1"); //只在一個頁面中有效
    request.setAttribute("name2","A2");//只在一個請求中有效
    session.setAttribute("name3","A3");//只在一個瀏覽器中有效
    application.setAttribute("name4","A4");//只在一個伺服器中有效
%>

<%
    //透過尋找方式查找
    //從底往上找(作用域) page --> request --> session --> application
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>
<%
    pageContext.forward("/pageContextDemo02.jsp");
%>
<h1>P1</h1>
<h2>取出的值為</h2>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>
<h3><%=name5%></h3>
</body>
</html>
