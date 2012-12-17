package demo.boardmessage.core;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Bill
 * @version 2012-12-17
 */
public class ApplicationServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ctxPath = req.getContextPath();
        String uri = req.getRequestURI();

        if (ctxPath != null && ctxPath.length() > 0) {
            uri = uri.substring(ctxPath.length());
        }

        System.out.println(uri);
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
