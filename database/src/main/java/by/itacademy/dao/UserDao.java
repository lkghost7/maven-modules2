package by.itacademy.dao;

import by.itacademy.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDao {
    private static final UserDao INSTANCE = new UserDao();

    private SessionFactory sessionFactory;

    public static UserDao getInstance() {
        return INSTANCE;
    }

    private SessionFactory getSessionFactory() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void saveUser(User user) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        Session currentSession = sessionFactory.openSession();
        currentSession.save(user);
        sessionFactory.close();
    }

    public List<User> findAll() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("select e from User e", User.class)
                .list();
    }
}

