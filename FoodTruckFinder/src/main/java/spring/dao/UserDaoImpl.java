package spring.dao;

import database.HibernateUtil2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.support.BeanDefinitionValidationException;

import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import spring.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(User u){

        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(u);
        transaction.commit();
        session.close();

    }

    public List<User> list(){

        Session session = this.sessionFactory.openSession();
        List<User> userList = session.createQuery("FROM User").list();
        session.close();
        return userList;

    }

    public boolean validate(String username, String password) {

        Transaction transaction = null;
        User user = null;
        try (Session session = this.sessionFactory.openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (User) session.createQuery("FROM User WHERE User.email = :username").setParameter("username", username)
                    .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }



}
