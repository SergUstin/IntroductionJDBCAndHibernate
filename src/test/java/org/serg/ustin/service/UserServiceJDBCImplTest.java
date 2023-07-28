package org.serg.ustin.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.serg.ustin.model.User;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceJDBCImplTest extends UserServiceTest {

    private final UserService userService = new UserServiceJDBCImpl();

    @BeforeEach
    public void testTuning() {
        userService.dropUserTable();
        userService.createUserTable();
        userService.saveUser(getTestName(), getTestLastName(), getTestAge());
    }

    @Test
    void createUserTable() {
        try {
            userService.dropUserTable();
            userService.createUserTable();
        } catch (Exception e) {
            fail("При тестировании, создании таблицы произошла ошибка!\n" + e.getMessage());
        }
    }

    @Test
    void dropUserTable() {
        try {
            userService.dropUserTable();
        } catch (Exception e) {
            fail("При тестировании, удалении таблицы произошла ошибка!\n" + e.getMessage());
        }
    }

    @Test
    void saveUser() {
        try {
            User user = userService.getAllUsers().get(0);
            assertEquals(getTestName(), user.getName());
            assertEquals(getTestLastName(), user.getLastName());
            assertEquals(getTestAge(), user.getAge());
        } catch (Exception e) {
            fail("При тестировании, сохранения пользователя произошла ошибка!\n" + e.getMessage());
        }
    }

    @Test
    void removeUserById() {
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void clearUserTable() {
    }
}