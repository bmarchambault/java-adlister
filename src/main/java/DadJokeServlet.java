import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DadJokeServlet", urlPatterns = "/dadjoke")
public class DadJokeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String joke = request.getParameter("joke"); //this is a parameter that is looking for the key word joke - this is passed in with the request

        if (joke == null){//default response to nothing.
            joke = "hungry";
        }
        out.println("<h1> Hi " + joke + ", I'm Dad! </h1>");

    }




}


