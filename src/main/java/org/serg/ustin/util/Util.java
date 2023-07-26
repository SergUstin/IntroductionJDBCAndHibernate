package org.serg.ustin.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static SessionFactory sessionFactory;

    public static Connection getJDBCConnection () {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Соединение не установлено!");
            throw new RuntimeException(e);
        }

        return connection;
    }

    public static SessionFactory getHibernateConnection () {
        if (Objects.isNull(sessionFactory)) {
            try {

            } catch (Exception ignore) {

            }
        }
        return sessionFactory;
    }

}
