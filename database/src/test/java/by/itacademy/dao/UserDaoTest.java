package by.itacademy.dao;

import by.itacademy.model.User;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    private UserDao userDao;

    @Test
    public void saveUser() {
        UserDao.getInstance().saveUser(new User("Sensei"));
        UserDao.getInstance().saveUser(new User("Klop"));
        UserDao.getInstance().saveUser(new User("Zerg"));

    }

    @Test
    public void findAll() {
        List<User> all = UserDao.getInstance().findAll();
        all.forEach(a -> System.out.println(a));
    }
}