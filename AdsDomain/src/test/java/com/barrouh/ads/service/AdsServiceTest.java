package com.barrouh.ads.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AdsServiceTest {
	
	@Autowired
	private AdsService adsService;

	@Test
	public void addUserTest() {
		
		System.out.println(adsService.getAllUsers().size());
		
	}
/*
	@Test
	public void updateUserTest() {
	
	}

	@Test
	public void getUserByUserNameTest() {
		
	}

	@Test
	public void getAllUsersTest() {
		
	}

	@Test
	public void deleteUserTest() {
		
	}

	@Test
	public void addServerHostTest() {
		
	}

	@Test
	public void updateServerHostTest() {
		
	}

	@Test
	public void getServerHostByNameTest() {
		
	}

	@Test
	public void getAllServerHostsTest() {
		
	}

	@Test
	public void deleteServerHostTest() {
		
	}

	@Test
	public void addBindingTest() {
		
	}

	@Test
	public void updateBindingTest() {
		
	}

	@Test
	public void getBindingByIdTest() {
		
	}

	@Test
	public void getAllBindingsTest() {
		
	}

	@Test
	public void deleteBindingTest() {
		
	}

	@Test
	public void addApplicationTest() {
		
	}

	@Test
	public void updateApplicationTest() {
	
	}

	@Test
	public void getApplicationByIdTest() {
		
	}

	@Test
	public void getAllApplicationsTest() {
		
	}

	@Test
	public void deleteApplicationTest() {
		
	}*/

}
