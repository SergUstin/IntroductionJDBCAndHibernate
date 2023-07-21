package org.serg.ustin;


import org.serg.ustin.dao.UserDao;
import org.serg.ustin.dao.UserDaoJDBCImpl;
import org.serg.ustin.util.Util;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUserTable();

    }
}
