package chap3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RdTest3 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String data = (String) request.getAttribute("data");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("name : " + name + "<BR>");
        out.println("data : " + data + "<BR>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}