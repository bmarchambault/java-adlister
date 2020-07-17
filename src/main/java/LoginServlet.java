import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
                if(req.getMethod().equalsIgnoreCase("post")) {
                    String username = req.getParameter("username");
                    String password = req.getParameter("password");
                    if (username.equalsIgnoreCase("admin") && password.equals("password")) {
                        resp.sendRedirect("/profile.jsp");
                    }
                }
    }
}
