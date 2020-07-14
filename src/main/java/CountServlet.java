import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private static int counter = 0;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

      String reset = request.getParameter("reset");

      if (reset == null){
          counter += 1;
          out.println("<h1> Hello, you have visited this page " + counter + " times. </h1>");
      } else if (reset.equalsIgnoreCase("y") || reset.equalsIgnoreCase("yes") ) {
          counter = 1;
          out.println("<h1> You have reset the counter to " + counter + ". </h1>");

          //instructor solution: =========(but mine works)=====================================
//          if(reset == null){
//              counter =0;
//          }
//          counter += 1;
//          out.println("<h1> Hello, you have visited this page " + counter + " times. </h1>");
//      }======================================================================================
      }
    }
}