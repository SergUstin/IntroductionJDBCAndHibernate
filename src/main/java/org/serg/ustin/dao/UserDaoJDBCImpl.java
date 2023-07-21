package org.serg.ustin.dao;

import org.serg.ustin.model.User;
import org.serg.ustin.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    private final Connection connection = Util.getJDBCConnection();

    @Override
    public void createUserTable() {
        String sql = "create table if not exists user (id bigint auto_increment primary key not null, name varchar(50), lastName varchar(50), age tinyint(3) )";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dropUserTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void clearUserTable() {

    }
}
