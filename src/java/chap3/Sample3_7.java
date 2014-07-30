package chap3;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Sample3_7 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String button = request.getParameter("button");
        method(button);

        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println(
                "<FORM method=\"POST\" action=\"/WebApplication1/Sample3_7\">");
        out.println(
                "<INPUT type=\"submit\" name=\"button\" value=\"add\">");
        out.println(
                "<INPUT type=\"submit\" name=\"button\" value=\"rep\">");
        out.println(
                "<INPUT type=\"submit\" name=\"button\" value=\"rem\">");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    private void method(String button) {
        String val = "test1";
        ServletContext context = getServletContext();
        if (button == null) {
            return;
        }
        if (button.equals("add")) {
            context.setAttribute("val", val);
        } else if (button.equals("rem")) {
            context.removeAttribute("val");
        } else {
            context.setAttribute("val", "test2");
        }
    }

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
