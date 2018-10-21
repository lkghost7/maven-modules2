package by.itacademy.dao;

import by.itacademy.connection.ConnectionPool;
import by.itacademy.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDao {
    private static final UserDao INSTANCE = new UserDao();

    public static UserDao getInstance() {
        return INSTANCE;
    }

    public void saveUser(User user) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        currentSession.save(user);
        currentSession.getTransaction().commit();
        currentSession.close();
    }

    public List<User> findAll() {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        return currentSession
                .createQuery("select e from User e", User.class)
                .list();
    }
}
