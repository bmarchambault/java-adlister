package controllers;

import models.McBurger;
import models.McBurgers;
import org.webjars.WebJarAssetLocator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Let's get all our burgers, and list them here, with links to their individual product pages!
        McBurgers burgerDao = DaoFactory.getMcBurgersDao();

        WebJarAssetLocator locator = new WebJarAssetLocator();
        String fullPathToBootstrap = locator.getFullPath("bootstrap.js");
        req.setAttribute("bootstrapJs", fullPathToBootstrap);
        // we have 3 burgers, so let's send all to the JSP
        List<McBurger> allBurgers = new ArrayList<>();
        allBurgers.add(burgerDao.findById(1));
        allBurgers.add(burgerDao.findById(2));
        allBurgers.add(burgerDao.findById(3));
        req.setAttribute("allBurgers", allBurgers);
        req.getRequestDispatcher("WEB-INF/view/index.jsp").forward(req, resp);

    }
}