package com.barrouh.jds.dao;

import java.util.List;

import com.barrouh.jds.domain.User;

/**
 * 
 * @author mbarrouh
 *
 */
public interface UserRepository {
	
	void addUser(User user); 
    
    void updateUser(User user); 
    
    User getUserByUserName(String userName); 
    
    List<User> getAllUsers(); 
    
    void deleteUser(String userName);
}