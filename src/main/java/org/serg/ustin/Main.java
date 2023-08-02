package org.serg.ustin;


import org.serg.ustin.service.UserService;
import org.serg.ustin.service.UserServiceHibernateImpl;
import org.serg.ustin.service.UserServiceJDBCImpl;


public class Main {
    public static void main(String[] args) {
        script(new UserServiceJDBCImpl());
        script(new UserServiceHibernateImpl());


    }

    private static void script(UserService userService) {
        userService.createUserTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 50);
        userService.saveUser("Maria", "Kozina", (byte) 20);
        userService.saveUser("Petr", "Huk", (byte) 16);
        userService.saveUser("Oleg", "Petrov", (byte) 36);
        userService.getAllUsers().forEach(System.out::println);
        System.out.println();
        userService.removeUserById(2);
        userService.getAllUsers().forEach(System.out::println);
        System.out.println();
        userService.clearUserTable();
        userService.getAllUsers().forEach(System.out::println);
        System.out.println();
        userService.dropUserTable();
    }
}
