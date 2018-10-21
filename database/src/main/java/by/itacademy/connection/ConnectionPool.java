package by.itacademy.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionPool {
        private static final Object LOCK = new Object();
        private static ConnectionPool INSTANCE = null;
        private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        public static ConnectionPool getInstance() {
            if (INSTANCE == null) {
                synchronized (LOCK) {
                    if (INSTANCE == null) {
                        INSTANCE = new ConnectionPool();
                    }
                }
            }
            return INSTANCE;
        }

        public Session getConnection() {
            return sessionFactory.openSession();
        }
}
