package by.itacademy.dao;

import by.itacademy.model.User;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;


public class UserDaoTest {

    private UserDao userDao;

    @Test
    public void saveUser() {
        Long id = UserDao.getInstance().saveUser(new User("Sensey"));
        System.out.println(UserDao.getInstance().findAll());
        UserDao.getInstance().delete(id);
        System.out.println("Осталось в таблице только: " + UserDao.getInstance().findAll());
    }

    @Test
    public void findAll() {
        List<User> all = UserDao.getInstance().findAll();
        all.forEach(a -> System.out.println(a));

    }
}