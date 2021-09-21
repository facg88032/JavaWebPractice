package com.james.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        InputStream is = context.getResourceAsStream("/WEB-INF/classes/db.properties");//使用流讀取 寫入build後的路徑
        Properties properties = new Properties();
        properties.load(is);
        String name = properties.getProperty("username");
        String pwd = properties.getProperty("password");

        resp.getWriter().print(name+" : "+pwd);
    }
}
