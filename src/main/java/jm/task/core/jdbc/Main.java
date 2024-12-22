package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    private static final int AGE_ROMAN = 28;
    private static final int AGE_LIZA = 27;
    private static final int AGE_PAVEL = 30;
    private static final int AGE_NIKITA = 5;

    public static void main(final String[] args) {


        final UserService userServiceHibernate = new UserServiceImpl();
        userServiceHibernate.createUsersTable();
        userServiceHibernate.saveUser("Roman", "Smirnov", (byte) AGE_ROMAN);
        userServiceHibernate.saveUser("Liza", "Smirnova", (byte) AGE_LIZA);
        userServiceHibernate.saveUser("Pavel", "Nevmovenko", (byte) AGE_PAVEL);
        userServiceHibernate.saveUser("Nikita", "Kologriviy", (byte) AGE_NIKITA);

        userServiceHibernate.getAllUsers().forEach(System.out::println);
        userServiceHibernate.cleanUsersTable();
        userServiceHibernate.dropUsersTable();
        Util.closeSessionFactory();
    }
}
