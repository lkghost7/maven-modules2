package by.itacademy.dao;


import by.itacademy.connection.ConnectionPool;
import by.itacademy.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDao {
    private static final UserDao INSTANCE = new UserDao();

    public static UserDao getInstance() {
        return INSTANCE;
    }

    public Long saveUser(User user) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        Serializable id = currentSession.save(user);
        currentSession.getTransaction().commit();
        currentSession.close();
        return (Long) id;
    }

    public List<User> findAll() {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        List<User> users = currentSession.createQuery("select u from User u", User.class).list();
        currentSession.close();
        return users;
    }

    public void delete(Long id) {
        Session session = ConnectionPool.getInstance().getConnection();
        session.beginTransaction();
        int result = session.createQuery("delete from User u where u.id = " + id).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
