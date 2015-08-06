package com.gdjr.dataInquery.service.impl;

import com.gdjr.dataInquery.dao.UserDao;
import com.gdjr.dataInquery.domain.User;
import com.gdjr.dataInquery.page.Page;
import com.gdjr.dataInquery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ��˵�����û�Serviceʵ��
 *
 * @author ����: LiuJunGuang
 * @version ����ʱ�䣺2012-3-25 ����02:26:48
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    // ����û�
    public void addUser(User user) {
        userDao.insertUser(user);
    }

    // �����û�
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    public User findUserById(Integer userId) {
        return userDao.findUserByid(userId);
    }

    public List<User> findAllUser() {
        return userDao.findAll();
    }

    public User login(User user) {
        return userDao.userLogin(user);
    }

    //根据条件分页查询
    public List<User> users(Page p) {
        return userDao.users(p);
    }

    public int lines(){return userDao.lines();}


}
