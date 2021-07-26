package spring.main;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.UserDao;
import spring.model.User;

import java.util.List;

public class TestMain {

    public static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserDao dao = (UserDao)context.getBean("userDAO");

        User user = new User();
        user.setName("ITS A ME MARIO");
        user.setEmail("email@email");
        user.setPassword("pass");

        dao.save(user);
        System.out.println("SAVED SUCCESSFULLY");
        System.out.println("User: " + user);

        List<User> list = dao.list();
        for(User u : list){
            System.out.println("User List: " + u);
        }


    }

}
