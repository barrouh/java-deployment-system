package com.barrouh.ads.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.barrouh.ads.dao.ApplicationRepository;
import com.barrouh.ads.dao.BindingRepository;
import com.barrouh.ads.dao.ServerHostRepository;
import com.barrouh.ads.dao.UserRepository;
import com.barrouh.ads.domain.Application;
import com.barrouh.ads.domain.Binding;
import com.barrouh.ads.domain.ServerHost;
import com.barrouh.ads.domain.User;

/**
 * 
 * @author mbarrouh
 *
 */
@Repository
public class AdsRepository implements ApplicationRepository, BindingRepository ,ServerHostRepository, UserRepository {
	
	@PersistenceContext
	@Autowired
	private LocalContainerEntityManagerFactoryBean  entityManagerFactoryBean;

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteUser(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addServerHost(ServerHost serverHost) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateServerHost(ServerHost serverHost) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ServerHost getServerHostByName(String serverName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServerHost> getAllServerHosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteServerHost(String serverName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addBinding(Binding binding) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBinding(Binding binding) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Binding getBindingById(String bindingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Binding> getAllBindings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBinding(String bindingId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addApplication(Application application) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateApplication(Application application) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Application getApplicationById(String applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> getAllApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteApplication(String applicationId) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
