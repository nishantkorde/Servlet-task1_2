import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<head>");
            out.print("<title>User Login Page</title>");
        out.print("</head>");
        out.print("<body>");
            out.print("<center>");
            out.print("<User Login>");
            out.print("<form action = 'user'>");
                out.print("Enter Your Name : <input type='text' name='username'>");
                out.print("<br></br>");
                out.print("Enter Your Password : <input type='password' name='pass'>");
                out.print("<br></br>");
                out.print("<button type='Submit'>Login</button>");
            out.print("</form>");
            out.print("</center>");
        out.print("</body>");
        out.print("</html>");
    }
}
