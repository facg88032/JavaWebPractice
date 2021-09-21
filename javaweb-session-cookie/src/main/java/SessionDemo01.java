import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //獲取Session
        HttpSession session = req.getSession();

        //Session 添加資料
        session.setAttribute("name","賴文翔");

        //獲取Session id
        String id = session.getId();

        //判斷Session是否為新創
        if(session.isNew()){
            resp.getWriter().write("第一次創建"+id);
        }else{
            resp.getWriter().write("已經存在"+id);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}