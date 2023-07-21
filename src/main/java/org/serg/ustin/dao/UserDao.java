package org.serg.ustin.dao;

import org.serg.ustin.model.User;

import java.util.List;

public interface UserDao {

    void createUserTable();

    void dropUserTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void clearUserTable();

}
