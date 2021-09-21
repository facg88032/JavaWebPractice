import javax.servlet.*;
import javax.servlet.http.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;


public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        1. 獲取文件的位置
        String path = this.getServletContext().getRealPath("/WEB-INF/classes/cat2.jpg");

//        2. 文件檔名
        String filename = path.substring(path.lastIndexOf("\\")+1);

//        3. 設置瀏覽器頁面支持下載
        response.addHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(filename,"UTF-8") );
//        4. 獲取下載文件的輸入流(伺服器讀入要下載的檔案)
        FileInputStream in = new FileInputStream(path);
//        5. 創建緩衝區
        int len = 0;
        byte[] buffer = new byte[1024];
//        6.創建輸出流
        ServletOutputStream out = response.getOutputStream();
//        7. 將輸入流寫入緩衝區 並且用輸出流寫出給客戶端
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }

        out.close();
        in.close();
    }


}
