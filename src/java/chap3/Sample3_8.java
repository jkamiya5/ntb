package chap3;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Sample3_8 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Sample3_8 : doGet()");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("Sample3_8");
        out.println("<BR>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
