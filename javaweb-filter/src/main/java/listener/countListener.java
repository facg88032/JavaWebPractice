package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class countListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("onlineCount");
        if(onlineCount ==null){
            onlineCount = new Integer(1);
        }else{
            int count = onlineCount.intValue();
            onlineCount = new Integer(count+1);
        }
        ctx.setAttribute("onlineCount",onlineCount);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

        ServletContext ctx = httpSessionEvent.getSession().getServletContext();

        Integer onlineCount = (Integer) ctx.getAttribute("onlineCount");
        if(onlineCount ==null){
            onlineCount = new Integer(0);
        }else{
            int count = onlineCount.intValue();
            onlineCount = new Integer(count-1);
        }
        ctx.setAttribute("onlineCount",onlineCount);

    }
}
