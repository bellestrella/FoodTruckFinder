 /*
    DONE: connection to DB
    NEEDED: create hibernate util, .xml mapping, create try catch block, print to console message when
    data transfer when success/fail, print table to console (done in UsersTest class?)
 */
/*

package test;

// hibernate imports for bean factory method
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// Test class
public class EntityTest {

    public static void main(String[] args){

    // creates new configuration object
    Configuration configuration = new Configuration();

    // load our properties at app start up with db & aws creditials, as well as driver info to allow connection
    configuration.setProperty("hibernate.connection.driver_class", "oracle.jdbc.OracleDriver");
    configuration.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@trkdb.cmtkalryuwt4.us-east-2.rds.amazonaws.com:1521:EMPDB");
    configuration.setProperty("hibernate.connection.username", "admin");
    configuration.setProperty("hibernate.connection.password", "Java2021");
    configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle8iDialect");
    // allows hibernate to display to the console the query status
    configuration.setProperty("hiberante.show_sql", "true");

    // specify model class with annotation
    configuration.addAnnotatedClass(UsersTest.class);

        // From configuration object build a new session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // open session
        Session session = sessionFactory.openSession();
        // begin transaction
        Transaction transaction = session.beginTransaction();
        // session allows to build Users object with new parameters
       session.save(new UsersTest("edwin", "email@email.com", "pass", "owner"));

        // commits query to database
        transaction.commit();
        // close session factory
        session.close();
        sessionFactory.close();


*/



//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        try{
//            transaction.begin();
//            transaction.commit();
//
//            User u1 = new User();
//            u1.setUserid(2);
//            u1.setName("edwin");
//            u1.setEmailAddress("edwin@email.com");
//            u1.setPassWord("password");
//            u1.setUserType("owner");
//
//            entityManager.persist(u1);
//            transaction.commit();
//
//        } finally {
//            if( transaction.isActive()){
//                transaction.rollback();
//            }
//            entityManager.close();
//            entityManagerFactory.close();
//        }
/*


    }

}
*/
