package com.barrouh.ads.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barrouh.ads.dao.ApplicationRepository;
import com.barrouh.ads.dao.BindingRepository;
import com.barrouh.ads.dao.ServerHostRepository;
import com.barrouh.ads.dao.UserRepository;
import com.barrouh.ads.dao.impl.JdsRepository;
import com.barrouh.ads.domain.Application;
import com.barrouh.ads.domain.Binding;
import com.barrouh.ads.domain.ServerHost;
import com.barrouh.ads.domain.User;

/**
 * 
 * @author mbarrouh
 *
 */
@Service
public class JdsService implements ApplicationRepository, BindingRepository ,ServerHostRepository, UserRepository {
	
	@Autowired
	JdsRepository jdsRepository;

	@Override
	@Transactional
	public void addUser(User user) {
		 jdsRepository.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		 jdsRepository.updateUser(user);
	}

	@Override
	@Transactional
	public User getUserByUserName(String userName) {
		return jdsRepository.getUserByUserName(userName);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return jdsRepository.getAllUsers();
	}

	@Override
	@Transactional
	public void deleteUser(String userName) {
		 jdsRepository.deleteUser(userName);
	}

	@Override
	@Transactional
	public void addServerHost(ServerHost serverHost) {
		 jdsRepository.addServerHost(serverHost);
	}

	@Override
	@Transactional
	public void updateServerHost(ServerHost serverHost) {
		 jdsRepository.updateServerHost(serverHost);
	}

	@Override
	@Transactional
	public ServerHost getServerHostByName(String serverName) {
		return jdsRepository.getServerHostByName(serverName);
	}

	@Override
	@Transactional
	public List<ServerHost> getAllServerHosts() {
		return jdsRepository.getAllServerHosts();
	}

	@Override
	@Transactional
	public void deleteServerHost(String serverName) {
		 jdsRepository.deleteServerHost(serverName);
	}

	@Override
	@Transactional
	public void addBinding(Binding binding) {
		 jdsRepository.addBinding(binding);
	}

	@Override
	@Transactional
	public void updateBinding(Binding binding) {
		 jdsRepository.updateBinding(binding);
	}

	@Override
	@Transactional
	public Binding getBindingById(String bindingId) {
		return jdsRepository.getBindingById(bindingId);
	}

	@Override
	@Transactional
	public List<Binding> getAllBindings() {
		return jdsRepository.getAllBindings();
	}

	@Override
	@Transactional
	public void deleteBinding(String bindingId) {
		 jdsRepository.deleteBinding(bindingId);
	}

	@Override
	@Transactional
	public void addApplication(Application application) {
		 jdsRepository.addApplication(application);
	}

	@Override
	@Transactional
	public void  updateApplication(Application application) {
		 jdsRepository.updateApplication(application);
	}

	@Override
	@Transactional
	public Application getApplicationById(String applicationId) {
		return jdsRepository.getApplicationById(applicationId);
	}

	@Override
	@Transactional
	public List<Application> getAllApplications() {
		return jdsRepository.getAllApplications();
	}

	@Override
	@Transactional
	public void deleteApplication(String applicationId) {
		 jdsRepository.deleteApplication(applicationId);
	}
}
