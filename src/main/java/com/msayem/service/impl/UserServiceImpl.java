package com.msayem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msayem.entity.User;
import com.msayem.dao.UserDao;
import com.msayem.service.UserService;

/**
 * User Interface implementation Class.
 * 
 * @author MSAYEM
 * 
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Transactional
	public void saveUser(User user) {
		
		userDao.saveUser(user);
	}

	@Transactional(readOnly = true)
	public List<User> listUser() {
		
		return userDao.listUser();
	}

	@Transactional(readOnly = true)
	public User getUser(Long userid) {
	
		return userDao.getUser(userid);
	}

	@Transactional
	public void deleteUser(Long userid) {
		
		userDao.deleteUser(userid);
	}
}