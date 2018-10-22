package by.itacademy.dao;


import by.itacademy.model.Userka;
import org.junit.Test;


import javax.persistence.Table;
import java.util.List;

import static org.junit.Assert.*;


public class UserkaDaoTest {

    private UserDao userDao;

    @Test
    public void saveUser() {
        Long id = UserDao.getInstance().saveUser(new Userka("Sensey"));
//        System.out.println(UserDao.getInstance().findAll());
//        UserDao.getInstance().delete(id);
//        System.out.println("Осталось в таблице только: " + UserDao.getInstance().findAll());
    }

    @Test
    public void findAll() {
        List<Userka> all = UserDao.getInstance().findAll();
        all.forEach(a -> System.out.println(a));

    }
}