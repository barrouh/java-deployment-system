package com.barrouh.ads.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.barrouh.ads.domain.Application;
import com.barrouh.ads.domain.Binding;
import com.barrouh.ads.domain.IpAddress;
import com.barrouh.ads.domain.ServerHost;
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
	public void addServerHost() {
		jdsService.addServerHost(new ServerHost("localhost"));
		assertNotNull(jdsService.getServerHostByName("localhost"));
	}

	@Test
	@Order(2)
	public void updateServerHost() {
		ServerHost host = jdsService.getServerHostByName("localhost");
		host.setServerName("barrouh");
		jdsService.updateServerHost(host);
		host = jdsService.getServerHostByName("barrouh");
		assertEquals("barrouh", host.getServerName());
	}

	@Test
	@Order(3)
	public void getServerHostByName() {
		assertNotNull(jdsService.getServerHostByName("barrouh"));
	}

	@Test
	@Order(4)
	public void getAllServerHosts() {
		assertFalse(jdsService.getAllServerHosts().isEmpty());
	}

	@Test
	@Order(5)
	public void addUser() {
		User user = new User();
		user.setUserName("test");
		user.setPassword("test");
		user.setUserType("appuser");
		user.setServerHost(jdsService.getServerHostByName("barrouh"));
		jdsService.addUser(user);
		assertNotNull(jdsService.getUserByUserName("test"));
	}

	@Test
	@Order(6)
	public void updateUser() {
		User user = jdsService.getUserByUserName("test");
		user.setPassword("dummy");
		jdsService.updateUser(user);
		user = jdsService.getUserByUserName("test");
		assertEquals("dummy", user.getPassword());
	}

	@Test
	@Order(7)
	public void getUserByUserName() {
		assertNotNull(jdsService.getUserByUserName("test"));
	}

	@Test
	@Order(8)
	public void getAllUsers() {
		assertFalse(jdsService.getAllUsers().isEmpty());
	}

	@Test
	@Order(9)
	public void addApplication() {
		Application app = new Application();
		app.setApplicationName("TestApp");
		app.setApplicationType("Webapp");
		app.setApplicationUser(jdsService.getUserByUserName("test"));
		jdsService.addApplication(app);
		assertNotNull(jdsService.getApplicationByName(("TestApp")));
	}

	@Test
	@Order(10)
	public void updateApplication() {
		Application app = jdsService.getApplicationByName("TestApp");
		app.setApplicationName("TestApp2");
		jdsService.updateApplication(app);
		app = jdsService.getApplicationByName("TestApp2");
		assertNotNull(jdsService.getApplicationByName(("TestApp2")));
	}

	@Test
	@Order(11)
	public void getApplicationByName() {
		assertNotNull(jdsService.getApplicationByName("TestApp2"));
	}

	@Test
	@Order(12)
	public void getAllApplications() {
		assertFalse(jdsService.getAllApplications().isEmpty());
	}

	@Test
	@Order(13)
	public void addIpAddress() {
		IpAddress ip = new IpAddress();
		ip.setIp("192.186.1.1");
		ip.setServerHost(jdsService.getServerHostByName("barrouh"));
		ip.setState("free");
		jdsService.addIpAddress(ip);
		assertNotNull(jdsService.getIpAddressByIP(("192.186.1.1")));
	}

	@Test
	@Order(14)
	public void updateIpAddress() {
		IpAddress ip = jdsService.getIpAddressByIP("192.186.1.1");
		ip.setState("used");
		jdsService.updateIpAddress(ip);
		ip = jdsService.getIpAddressByIP("192.186.1.1");
		assertEquals("used", ip.getState());
	}

	@Test
	@Order(15)
	public void getIpAddressByIP() {
		assertNotNull(jdsService.getIpAddressByIP("192.186.1.1"));
	}

	@Test
	@Order(16)
	public void getAllIpAddresss() {
		assertFalse(jdsService.getAllIpAddresss().isEmpty());
	}

	@Test
	@Order(17)
	public void addBinding() {
		Binding bd = new Binding();
		bd.setApplication(jdsService.getApplicationByName("TestApp2"));
		bd.setIpAddress(jdsService.getIpAddressByIP("192.186.1.1"));
		bd.setServerHost(jdsService.getServerHostByName("barrouh"));
		jdsService.addBinding(bd);
		assertNotNull(jdsService.getBindingById(1L));
	}

	@Test
	@Order(18)
	public void updateBinding() {
		IpAddress ip = new IpAddress();
		ip.setIp("192.186.1.2");
		ip.setServerHost(jdsService.getServerHostByName("barrouh"));
		ip.setState("used");
		jdsService.addIpAddress(ip);

		Binding bd = jdsService.getBindingById(1L);
		ip = jdsService.getIpAddressByIP("192.186.1.2");
		bd.setIpAddress(ip);
		jdsService.updateBinding(bd);
		bd = jdsService.getBindingById(1L);

		assertEquals("192.186.1.2", bd.getIpAddress().getIp());
	}

	@Test
	@Order(19)
	public void getBindingById() {
		assertNotNull(jdsService.getBindingById(1L));
	}

	@Test
	@Order(20)
	public void getAllBindings() {
		assertFalse(jdsService.getAllBindings().isEmpty());
	}

	@Test
	@Order(21)
	public void deleteBinding() {
		jdsService.deleteBinding(1L);
		assertNull(jdsService.getBindingById(1L));
	}

	@Test
	@Order(22)
	public void deleteIpAddress() {
		jdsService.deleteIpAddress("192.186.1.2");
		assertNull(jdsService.getIpAddressByIP("192.186.1.2"));
	}
	
	@Test
	@Order(23)
	public void deleteApplication() {
		jdsService.deleteApplication("TestApp2");
		assertNull(jdsService.getApplicationByName("TestApp2"));
	}

	@Test
	@Order(24)
	public void deleteUser() {
		jdsService.deleteUser("test");
		assertNull(jdsService.getUserByUserName("test"));
	}

	@Test
	@Order(25)
	public void deleteServerHost() {
		jdsService.deleteIpAddress("192.186.1.1");
		jdsService.deleteServerHost("barrouh");
		assertNull(jdsService.getServerHostByName("barrouh"));
	}

}