package hibernate.crud.operations;

import models.User;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DbOperations {

    static Session sessionObj;
    static SessionFactory sessionFactoryObj;

    public final static Logger logger = Logger.getLogger(DbOperations.class);

    // This Method Is Used To Create The Hibernate's SessionFactory Object
    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration().addAnnotatedClass(User.class);
        configObj.configure("hibernate.cfg.xml");

        // SServiceRegistry Is Being Used ... Need to update on version depending
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactoryObj;
    }

    // Method 1: This Method Used To Create A New Student Record In The Database Table
    public static void createRecord() {

        User userObj = null;
        try {
            // Getting Session Object From SessionFactory
            sessionObj = buildSessionFactory().openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();

            // Creating Transaction Entities
            userObj = new User();
            userObj.setName("Eddie");
            userObj.setEmail("email@email.com");
            userObj.setPassword("pass");
            sessionObj.save(userObj);


            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
            logger.info("\nSuccessfully Created Records In The Database!\n");

        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
    }

    // Method 2: This Method Is Used To Display The Records From The Database Table
    @SuppressWarnings("unchecked")
    public static List displayRecords() {
        List usersList = new ArrayList();

        try {
            // Getting Session Object From SessionFactory
            sessionObj = buildSessionFactory().openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();

            usersList = sessionObj.createQuery("FROM User").list();

        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
        return usersList;
    }

    // Method 3: This Method Is Used To Update A Record In The Database Table
    public static void updateRecord(int id) {
        try {
            // Getting Session Object From SessionFactory
            sessionObj = buildSessionFactory().openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();

            // Creating Transaction Entity
            User uObj = (User) sessionObj.get(User.class, id);
            uObj.setName("New Name");
            uObj.setEmail("New email");
            uObj.setPassword("New pass");


            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
            logger.info("\nUser With Id?= " + id + " Is Successfully Updated In The Database!\n");
        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
    }

        // Method 4: This Method Is Used To Delete A Particular Record From The Database Table
        public static void deleteRecord(Integer id){
            try {
                // Getting Session Object From SessionFactory
                sessionObj = buildSessionFactory().openSession();
                // Getting Transaction Object From Session Object
                sessionObj.beginTransaction();

                User useObj = findRecordById(id);
                sessionObj.delete(useObj);

                // Committing The Transactions To The Database
                sessionObj.getTransaction().commit();
                logger.info("\nUser With Id?= " + id + " Is Successfully Deleted From The Database!\n");
            } catch (Exception sqlException) {
                if (null != sessionObj.getTransaction()) {
                    logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                    sessionObj.getTransaction().rollback();
                }
                sqlException.printStackTrace();
            } finally {
                if (sessionObj != null) {
                    sessionObj.close();
                }
            }
        }
        // Method 5: This Method To Find Particular Record In The Database Table
        public static User findRecordById (Integer find_id){
            User findUserObj = null;
            try {
                // Getting Session Object From SessionFactory
                sessionObj = buildSessionFactory().openSession();
                // Getting Transaction Object From Session Object
                sessionObj.beginTransaction();

                findUserObj = (User) sessionObj.load(User.class, find_id);

            } catch (Exception sqlException) {
                if (null != sessionObj.getTransaction()) {
                    logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                    sessionObj.getTransaction().rollback();
                }
                sqlException.printStackTrace();
            }
            return findUserObj;

        }
        // Method 6: This Method Is Used To Delete All Records From The Database Table
        public static void deleteAllRecords () {
            try {
                // Getting Session Object From SessionFactory
                sessionObj = buildSessionFactory().openSession();
                // Getting Transaction Object From Session Object
                sessionObj.beginTransaction();

                Query queryObj = sessionObj.createQuery("DELETE FROM User");
                queryObj.executeUpdate();

                // Committing The Transactions To The Database
                sessionObj.getTransaction().commit();
                logger.info("\nSuccessfully Deleted All Records From The Database Table!\n");
            } catch (Exception sqlException) {
                if (null != sessionObj.getTransaction()) {
                    logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                    sessionObj.getTransaction().rollback();
                }
                sqlException.printStackTrace();
            } finally {
                if (sessionObj != null) {
                    sessionObj.close();
                }
            }
        }
    }


