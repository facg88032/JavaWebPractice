import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo02 extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");

            //獲取Session
            HttpSession session = req.getSession();
            String id = session.getId();
            String name = (String) session.getAttribute("name");
            resp.getWriter().write(id);
            resp.getWriter().write("名字: "+name);
        }



}
