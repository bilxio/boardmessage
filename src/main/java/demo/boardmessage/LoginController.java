package demo.boardmessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Bill
 * @version 2012-12-17
 */
public class LoginController implements Controller {

    public String action(HttpServletRequest req, HttpServletResponse resp) {

        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        if(userName != null && password != null){
            return "welcome";
        }else {
            return "fail.jsp";
        }
    }

}
