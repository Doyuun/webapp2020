package iducs.jsp202012045;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ch04/responsive-form", name = "ResponsiveForm")
public class ResponsiveForm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"ko\">\n" +
                "<head>\n" +
                "    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "    <script src=\"js/bootstrap.bundle.min.js\"></script>\n" +
                "    <!--<script src=\"js/jquery.slim.js\"></script>-->\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>202012045 SongDoyun</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container-fluid ps-md-0\">\n" +
                "    <div class=\"row g-0\">\n" +
                "        <div class=\"d-none d-md-flex col-md-4 col-lg-6 bg-image\"></div>\n" +
                "        <div class=\"col-md-8 col-lg-6\">\n" +
                "            <div class=\"login d-flex align-items-center py-5\">\n" +
                "                <div class=\"container\">\n" +
                "                    <div class=\"row\">\n" +
                "                        <div class=\"col-md-9 col-lg-8 mx-auto\">\n" +
                "                            <h3 class=\"login-heading mb-4\">Welcome back!</h3>\n" +
                "\n" +
                "                            <!-- Sign In Form -->\n" +
                "                            <form>\n" +
                "                                <div class=\"form-floating mb-3\">\n" +
                "                                    <input type=\"email\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\">\n" +
                "                                    <label for=\"floatingInput\">Email address</label>\n" +
                "                                </div>\n" +
                "                                <div class=\"form-floating mb-3\">\n" +
                "                                    <input type=\"password\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Password\">\n" +
                "                                    <label for=\"floatingPassword\">Password</label>\n" +
                "                                </div>\n" +
                "\n" +
                "                                <div class=\"form-check mb-3\">\n" +
                "                                    <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"rememberPasswordCheck\">\n" +
                "                                    <label class=\"form-check-label\" for=\"rememberPasswordCheck\">\n" +
                "                                        Remember password\n" +
                "                                    </label>\n" +
                "                                </div>\n" +
                "\n" +
                "                                <div class=\"d-grid\">\n" +
                "                                    <button class=\"btn btn-lg btn-primary btn-login text-uppercase fw-bold mb-2\" type=\"submit\">Sign in</button>\n" +
                "                                    <div class=\"text-center\">\n" +
                "                                        <a class=\"small\" href=\"#\">Forgot password?</a>\n" +
                "                                    </div>\n" +
                "                                </div>\n" +
                "\n" +
                "                            </form>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
