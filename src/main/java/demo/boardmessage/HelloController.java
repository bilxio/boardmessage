package demo.boardmessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Bill
 * @version 2012-12-17
 */
public class HelloController implements Controller {
    @Override
    public String action(HttpServletRequest req, HttpServletResponse resp) {
        return "hello/index";
    }

    public String hi(HttpServletRequest req, HttpServletResponse resp) {
        return "hello/hi";
    }

}
