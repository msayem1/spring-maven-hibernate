package com.msayem.dao;

import java.util.List;
import com.msayem.entity.User;

/**
 * Interface for User DAO Implementation.
 * 
 * @author MSAYEM
 * 
 */
public interface UserDao {

	public void saveUser(User user);

	public List<User> listUser();

	public User getUser(Long userid);

	public void deleteUser(Long userid);
}