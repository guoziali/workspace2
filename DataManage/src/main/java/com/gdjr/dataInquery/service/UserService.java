package com.gdjr.dataInquery.service;


import com.gdjr.dataInquery.domain.User;
import com.gdjr.dataInquery.page.Page;

import java.util.List;


public interface UserService {

	// ����û�
	public abstract void addUser(User user);

	public abstract void updateUser(User user);

	public abstract void deleteUser(Integer userId);

	public abstract User findUserById(Integer userId);

	public abstract List<User> findAllUser();

	public abstract User login(User user);

    //根据条件分页查询
    public List<User> users(Page p);

    public int lines();



}