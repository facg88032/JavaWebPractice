import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //瀏覽器3秒自動刷新
        resp.setHeader("refresh","3");

        //在內存中創建一張圖片
        BufferedImage img = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        //得到圖片
        Graphics2D g = (Graphics2D) img.getGraphics();
        //設置背景顏色
        g.setColor(Color.white);
        g.fillRect(0,0,80,20);
        //給圖片數據
        g.setColor(Color.cyan);
        g.setFont(new Font(null,Font.ITALIC,20));
        g.drawString(makeNum(),0,20);

        //告訴瀏覽器 請求圖片方式打開
        resp.setContentType("image/jpeg");
        //網站存在緩存 不讓瀏覽器緩存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragam","no-cache");
        
        //把圖片寫給瀏覽器
        ImageIO.write(img,"jpg", resp.getOutputStream());


    }

    private String makeNum(){
        Random random = new Random();
        String num =random.nextInt(9999999)+"";
        StringBuffer sb = new StringBuffer();
        //補0 保證7位數字
        for (int i = 0; i < 7-num.length(); i++) {
            sb.append("0");
        }
        num = sb.toString()+num;
        return num;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
