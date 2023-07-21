package org.serg.ustin.service;

import org.serg.ustin.dao.UserDao;
import org.serg.ustin.dao.UserDaoJDBCImpl;
import org.serg.ustin.model.User;

import java.util.List;

public class UserServiceJDBCImpl implements UserService{

    private UserDao userDao = new UserDaoJDBCImpl();

    @Override
    public void createUserTable() {
        userDao.createUserTable();
    }

    @Override
    public void dropUserTable() {
        userDao.dropUserTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void clearUserTable() {
        userDao.clearUserTable();
    }
}
