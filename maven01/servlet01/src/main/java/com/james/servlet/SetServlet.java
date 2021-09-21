package com.james.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class SetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        System.out.println("Set: "+context);
        String username = "冬瓜";
        context.setAttribute("username",username);//將一個數據保留在ServletContext中 id為username 值為username
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
