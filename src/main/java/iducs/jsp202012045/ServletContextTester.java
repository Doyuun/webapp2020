package iducs.jsp202012045;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.*;

@WebServlet(name = "ServletContextTester", value/*urlPatterns*/ = "/ServletContextTester")
public class ServletContextTester extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext sc = getServletContext();
        String driverName = sc.getInitParameter("driver-name");
        out.println("driver name is=" + driverName + "<br/>");
        out.println("name = " + request.getParameter("name") + "<br/>");
        out.println("queryString = " + request.getQueryString());
        out.close();
    }
}
