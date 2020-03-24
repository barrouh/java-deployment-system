package com.barrouh.ads.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.barrouh.ads.domain.User;

/**
 * 
 * @author mbarrouh
 *
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:app-context.xml") 
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdsServiceTest {
	
	@Autowired
	private JdsService jdsService;

	@Test
	@Order(1)
	public void addUser() {
	    User user = new User();
		jdsService.addUser(user);
	}

	@Test
	public void updateUser() {
	
	}

	@Test
	public void getUserByUserName() {
	
	}

	@Test
	public void getAllUsers() {
	
	}

	@Test
	public void deleteUser() {
		
	}

	@Test
	public void addServerHost() {
		
	}

	@Test
	public void updateServerHost() {
		
	}

	@Test
	public void getServerHostByName() {
		
	}

	@Test
	public void getAllServerHosts() {
		
	}

	@Test
	public void deleteServerHost() {
		 
	}

	@Test
	public void addBinding() {
		
	}

	@Test
	public void updateBinding() {
	
	}

	@Test
	public void getBindingById() {
		
	}

	@Test
	public void getAllBindings() {
	
	}

	@Test
	public void deleteBinding() {
		
	}

	@Test
	public void addApplication() {
	
	}

	@Test
	public void  updateApplication() {

	}

	@Test
	public void getApplicationById() {
		
	}

	@Test
	public void getAllApplications() {
		
	}

	@Test
	public void deleteApplication() {
		
	}
	
}