package iducs.jsp202012045;

/*
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
*/

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// @WebServlet(name = "OurServlet", value = "/OurServlet")
@WebServlet(
        urlPatterns = {
                "/OurServlet",
                "/today"
        },
        initParams = {
                @WebInitParam(name = "init-param", value = "init-value")
        })

/*
public class OurServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
*/

public class OurServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        System.out.println("init : " + config.getInitParameter("init-param"));
    }

    public OurServlet() {
        System.out.println("constructor : ");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("service : ");
        super.service(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) {
        System.out.println("doPost : " + request.getParameter("name") + " : " +
                request.getParameter("phone"));
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("doGet : " + request.getParameter("name") + " : " +
                request.getParameter("phone"));
    }
}