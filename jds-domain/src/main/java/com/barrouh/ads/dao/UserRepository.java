package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.User;

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