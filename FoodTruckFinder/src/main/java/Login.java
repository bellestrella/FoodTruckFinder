
import hibernate.crud.operations.DbOperations;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import spring.dao.UserDao;
import spring.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

//Servlet implementation class Login

public class Login extends HttpServlet {
    public static Object fieldUsername = new Object();
    public static Object fieldPassword = new Object();
    private static final long serialVersionUID = 1L;

    private UserDao loginDao;


    /* @see HttpServlet#HttpServlet()
     */
    public Login() {
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
        UserDao loginDao = new UserDao() {
            private SessionFactory sessionFactory;

            @Override
            public void save(User u) {

            }

            @Override
            public List<User> list() {
                return null;
            }

            @Override
            public boolean validate(String username, String password) {
                System.out.println("I'm SUPER tired");

                //        User user = null;
//       Session session = this.sessionFactory.openSession();
//
//            List users = session.createQuery("FROM User WHERE User.email = :username ").setParameter("username", username).list();
//            Object userObj = users.get(0);

                List viewUsers = DbOperations.displayRecords();
                if (viewUsers != null & viewUsers.size() > 0) {
                    for (Object userObj : viewUsers ) {
                        if (userObj instanceof User)
                        System.out.println(userObj);
                        fieldUsername = ((User) userObj).getEmail();
                        fieldPassword = ((User) userObj).getPassword();
                        System.out.println(fieldUsername);
                        System.out.println(fieldPassword);
                    }
                }

                return false;
            }
        };

        String username, password;
        boolean status = false;
        String[] var;
        var = request.getReader().readLine().replaceAll("\"", "").split(" ");
        username = var[0];
        password = var[1];

        status = loginDao.validate(username, password);
        System.out.println("Field username" + fieldUsername);
        System.out.println("Field Password" + fieldPassword);

        if(username.equals(fieldUsername) && (password.equals(fieldPassword))){
            System.out.println("True");
            status = true;
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