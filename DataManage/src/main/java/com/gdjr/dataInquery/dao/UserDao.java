package com.gdjr.dataInquery.dao;

import com.gdjr.dataInquery.domain.User;
import com.gdjr.dataInquery.page.Page;

import java.util.List;

public interface UserDao {

    public abstract void insertUser(User user);

    public abstract void updateUser(User user);

    public abstract void deleteUser(Integer userId);

    public abstract User findUserByid(Integer userId);

    public abstract List<User> findAll();

    public abstract User userLogin(User user);

    public abstract List<User> users(Page p);

    public abstract int lines();
}