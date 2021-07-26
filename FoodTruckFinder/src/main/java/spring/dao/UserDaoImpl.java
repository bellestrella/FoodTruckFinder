package spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.support.BeanDefinitionValidationException;
import org.springframework.test.web.ModelAndViewAssert;
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



}
