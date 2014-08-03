package chap4;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Sample4_6 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String button = request.getParameter("button");
        method(button, request);

        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("<FORM method=\"POST\" action=\"/WebApplication1/Sample4_6\">");
        out.println("<INPUT type=\"submit\" name=\"button\" value=\"add\">");
        out.println("<INPUT type=\"submit\" name=\"button\" value=\"rem\">");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    private void method(String button,
            HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        if (button == null) {
            return;
        }
        if (button.equals("add")) {
            session.setAttribute("val", new Sample4_6Bean());
        } else if (button.equals("rem")) {
            session.removeAttribute("val");
        }
    }

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
