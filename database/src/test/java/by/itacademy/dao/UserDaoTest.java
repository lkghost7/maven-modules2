package by.itacademy.dao;

import by.itacademy.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    private UserDao userDao;

    @Test
    public void saveUser() {
        UserDao.getInstance().saveUser(new User("Vinty"));
    }

    @Test
    public void findAll() {
    }
}