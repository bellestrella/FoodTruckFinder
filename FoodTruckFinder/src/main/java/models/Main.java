// Test clas which will test inserting Food Trucks and Users

package models;

// imports needed to run test

// import lists to collect and have the ability to display
import java.util.List;
// import all hibernate interfaces
import org.hibernate.*;
// import to fix decascade the hibernate query interface
import org.hibernate.query.Query;

// Test class
public class Main {
    // Test Initiation
    public static void main(String[] args){

        // uses our hibernate util to connect with the database
        Session session = HibernateUtil.getSessionFactory().openSession();
        // starts our transaction which allows CRUDE operations
        session.beginTransaction();

        // build instance obj
        User u = new User ("Miguel", "email", "password", "OWNER");
        session.save(u);
        User u2 = new User("Ed", "myemail", "pass", "Customer");
        session.save(u2);

        // build object with food truck details and saves obj
        session.save(new FoodTruck("Valentinas", "11500 Menchaca Road Austin, Texas 78748", "(512) 221-4248", "wed-sun", "BBQ", "menu"));
        session.save(new FoodTruck("Pizza", "42 Wallaby Way, Sydney", "(512) 55555", "closed", "pizza", "menu"));
        // get the Transaction instance associated with this session and commits to db
        session.getTransaction().commit();

        // build a query in session with HQL string to fetch table data
        Query q = session.createQuery("FROM FoodTruck");

        // fill our list with the results
        List<FoodTruck> resultList = q.list();

        // displays to the console
        System.out.println("\nNumber of Food Trucks: " + resultList.size());
        for (FoodTruck next : resultList) {
            System.out.println("\n\nDisplay Food Truck List:\n " + next);
        }


    }

}
