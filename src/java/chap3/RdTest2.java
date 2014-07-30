package chap3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RdTest2 extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String str = (String) request.getAttribute(
                "javax.servlet.forward.request_uri");
        System.out.println("RdTest2 : " + str);
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("RdTest2");
        out.println("<BR>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}