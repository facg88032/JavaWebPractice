<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%= new Date()%>
  <hr>
  <%
  int sum = 0;
    for (int i = 0; i <=100 ; i++) {
      sum +=i;
    }
  %>
  <h1><%= sum %></h1>

  <%
    for (int i = 0; i <=3 ; i++) {
  %>
  <h1>ASDYYJ</h1>
  <%
    }
  %>



  <%!
  static {
    System.out.println("Loding servlet!");
  }
  private  int globalvar = 0;
  public void kuang(){
    System.out.println("進入kuang");
  }

  %>
  <%
    kuang();
  %>

  </body>
</html>
