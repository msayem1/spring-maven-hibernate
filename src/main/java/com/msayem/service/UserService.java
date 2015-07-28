package com.msayem.service;

import java.util.List;
import com.msayem.entity.User;

/**
 * Interface for User Service Implementation.
 * 
 * @author MSAYEM
 * 
 */
public interface UserService {

	public void saveUser(User user);

	public List<User> listUser();

	public User getUser(Long userid);

	public void deleteUser(Long userid);
}