import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }
}
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//
//        if(session.getAttribute("font-color") == null && session.getAttribute("background-color") == null){
//            session.setAttribute("font-color", "pink");
//            session.setAttribute("background-color","blue");
//        }
//        request.getRequestDispatcher("/profile.jsp").forward(request, response);