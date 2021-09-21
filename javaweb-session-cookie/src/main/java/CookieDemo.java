import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();
        //獲取Cookies
        Cookie[] cookies = req.getCookies();

        //判斷Cookies是否為空
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("lastlongtime")) {
                    long lastlongtime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastlongtime);
                    out.write("上一次訪問" + date.toGMTString());

                }
            }
        } else {
            out.write("這是第一次訪問");
        }
        System.out.println("你好");
        Cookie cookie = new Cookie("lastlongtime", System.currentTimeMillis() + "");
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
