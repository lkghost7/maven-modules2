package by.itacademy.service;

import by.itacademy.dao.UserDao;
import by.itacademy.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserService {

    private static final UserService INSTANCE = new UserService();

    public List<User> getDefaultUser() {
        return UserDao.getInstance().findAll();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
