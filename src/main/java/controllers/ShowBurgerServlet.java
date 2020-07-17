package controllers;

import models.McBurger;
import models.McBurgers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowBurgerServlet", urlPatterns = "/burgers/show")
public class ShowBurgerServlet  extends HttpServlet {
    // This will require a doGet()

    // This method assumes there **IS** a burger ID in the URL parameters
    // i.e. http://localhost:8080/burgers/show?id=3


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // check to see if there is an ID in the URL parameters
        long burgerId = Long.parseLong(req.getParameter("id"));

        // Create a connection to the DaoFactory
        McBurgers burgerDao = DaoFactory.getMcBurgersDao();
        // now we can access all the McBurgers Interface methods!

        // Get the burger by the ID passed in the URL
        McBurger burger = burgerDao.findById(burgerId);

        // set the attribute "burger" to the burger we just found
        req.setAttribute("burger", burger);
        req.getRequestDispatcher("/WEB-INF/view/burgers/burgers-show.jsp").forward(req,resp);
    }
}