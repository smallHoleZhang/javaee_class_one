import com.sun.net.httpserver.HttpServer;
import org.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by hasee on 2017/8/30.
 */
@WebServlet(name = "loginservlet", urlPatterns = "/org/loginservlet")
public class loginservlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("gb2312");
        LoginDao loginDao = new LoginDao();
        login login = loginDao.checkLogin(request.getParameter("name"),request.getParameter("password"));
        if(login!=null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("login",login);
            response.sendRedirect("/main.jsp");
        }else {
            response.sendRedirect("error.jsp");
        }

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException
    {
        doGet(request,response);
    }
}
