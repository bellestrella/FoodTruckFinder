package database;

import models.FoodTruck;
import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class HibernateUtil2 {

    Configuration config = new Configuration().configure();

    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
            .applySettings(config.getProperties());

    private final SessionFactory SF = config.buildSessionFactory(builder.build());

    EntityManager eManager;

    private void saveUser(User user){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        session.save(user);

        tx.commit();
        session.close();
    }

    private void updateUser(User user){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        session.update(user);

        tx.commit();
        session.close();

    }

    private void deleteUser(User user){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        session.delete(user);

        tx.commit();
        session.close();

    }
    //Will not work in current form. session.get() expects PK
  /*    private User getByEmail(String email){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

      User user = (User) session.get(User.class, "user")
                .add(Restrictions.eq("user.email", email)).uniqueResult();

        tx.commit();
        session.close();

        return user;
    }*/

    private void saveFoodTruck(FoodTruck foodTruck){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        session.save(foodTruck);

        tx.commit();
        session.close();
    }

    private void updateFoodTruck(FoodTruck foodTruck){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        session.update(foodTruck);

        tx.commit();
        session.close();

    }

    private void deleteFoodTruck(FoodTruck foodTruck){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        session.delete(foodTruck);

        tx.commit();
        session.close();

    }

    private List<FoodTruck> getAllFoodTrucks(){
        Session session = this.SF.openSession();
        Transaction tx = session.beginTransaction();

        CriteriaBuilder cb = eManager.getCriteriaBuilder();
        CriteriaQuery<FoodTruck> cq = cb.createQuery(FoodTruck.class);
        Root<FoodTruck> from = cq.from(FoodTruck.class);
        CriteriaQuery<FoodTruck> all = cq.select(from);
        TypedQuery<FoodTruck> allQuery = eManager.createQuery(all);

        List<FoodTruck> aGoodStreet = allQuery.getResultList();

        tx.commit();
        session.close();

        return aGoodStreet;
    }
}
