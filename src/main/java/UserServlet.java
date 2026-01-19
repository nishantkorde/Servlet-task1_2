import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String user = req.getParameter("username");
        String password = req.getParameter("pass");

        if ("nishant".equals(user) && "12345".equals(password))
        {
            System.out.println("Valid User");
        }
        else
        {
            System.out.println("Invalid User");
        }
    }
}
