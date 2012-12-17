package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: Greta Wang
 * Date: 12/17/12
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
                                                                           ServletException,
                                                                           IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        if(userName != null && password != null){
            resp.sendRedirect("welcome.jsp");
        }else {
            resp.sendRedirect("fail.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
                                                                            ServletException,
                                                                            IOException {
        doGet(req, resp);
    }
}
