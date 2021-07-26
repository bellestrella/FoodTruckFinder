package spring.dao;

import spring.model.User;

import java.util.List;

public interface UserDao {

    public void save(User u);
    public List<User> list();
}
