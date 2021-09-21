<%--
  Created by IntelliJ IDEA.
  User: inspirit851023
  Date: 2021/9/16
  Time: 下午 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
原始碼
scop作用域
public void setAttribute(String name, Object attribute, int scope) {
        switch(scope) {
        case 1:
            this.mPage.put(name, attribute);
            break;
        case 2:
            this.mRequest.put(name, attribute);
            break;
        case 3:
            this.mSession.put(name, attribute);
            break;
        case 4:
            this.mApp.put(name, attribute);
            break;
        default:
            throw new IllegalArgumentException("Bad scope " + scope);
        }

    }--%>


<%
    pageContext.setAttribute("name5","ooo",pageContext.SESSION_SCOPE); //只在一個頁面中有效

%>
</body>
</html>
