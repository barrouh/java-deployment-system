package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.User;

/**
 * 
 * @author mbarrouh
 *
 */
public interface UserRepository {
	
	int addUser(User user); 
    
    int updateUser(User user); 
    
    User getUserByUserName(String userName); 
    
    List<User> getAllUsers(); 
    
    int deleteUser(String userName);

}
