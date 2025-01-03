package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao UserDaoHibernateImpl = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        UserDaoHibernateImpl.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        UserDaoHibernateImpl.dropUsersTable();
    }

    @Override
    public void saveUser(final String name, final String lastName, final byte age) {
        UserDaoHibernateImpl.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(final long id) {
        UserDaoHibernateImpl.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return UserDaoHibernateImpl.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        UserDaoHibernateImpl.cleanUsersTable();
    }
}
