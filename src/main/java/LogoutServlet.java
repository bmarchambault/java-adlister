import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;




@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        request.getSession().removeAttribute("user");
//        request.getSession().invalidate();
//        response.sendRedirect("/login");
//    }
//}
////
//    @WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
//    public class LogoutServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/WEB-INF/logout.jsp").forward(request, response);
        }
//
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            request.getSession().removeAttribute("user");
            request.getSession().invalidate();
            response.sendRedirect("/login");
        }
}
//            HttpSession session = request.getSession();
//                session.removeAttribute("isAdmin");
//                response.sendRedirect("/login");
//            }
//        }