package servlets;

import spring.dao.UserDao;
import spring.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private UserDao loginDao;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println(request.getParameterNames());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String username, password;
        boolean status = false;
        String[] var;
        var = request.getReader().readLine().replaceAll("\"", "").split(" ");
        username = var[0];
        password = var[1];

        try {
            status = loginDao.validate(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Username: " + username + " Password: " + password);
        if (status) {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            PrintWriter out = response.getWriter();
            String val = "{ \"val\": \"True\"}";
            out.print(val);
            out.flush();
        } else {
            try {
                throw new Exception("Login not successful");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}