import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name"); //this is a parameter that is looking for the key word joke - this is passed in with the request. in the web browser that pops up.  add: /hello to see hello world.  add /hello?name=Bobbie to see hello bobbie;

        if (name == null){//default response to nothing.
            name = "World";
        }
        out.println("<h1> Hello " + name + "! </h1>");

    }
}
