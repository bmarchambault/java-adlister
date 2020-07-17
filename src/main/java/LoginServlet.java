import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")

public class LoginServlet extends HttpServlet {

//    a get request just grabs the info it needs and loads a page with that data.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this is telling the get which page to load.
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

//    it get values from froms, the servlet utilizes the do post method. the parameter name and the name on the form must match.   Basically here, the do post is reading information, applying it to the code and redirecting.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                    String username = req.getParameter("username");
                    String password = req.getParameter("password");
                    boolean validLogin = username.equalsIgnoreCase("admin") && password.equals("password");
                     if (validLogin){
//                         this is a get request and references a servlet
                         resp.sendRedirect("/profile");
                     }else{
                         resp.sendRedirect("/login");
                     }
                }

}
