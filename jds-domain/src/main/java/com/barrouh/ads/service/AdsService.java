package com.barrouh.ads.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barrouh.ads.dao.ApplicationRepository;
import com.barrouh.ads.dao.BindingRepository;
import com.barrouh.ads.dao.ServerHostRepository;
import com.barrouh.ads.dao.UserRepository;
import com.barrouh.ads.dao.impl.AdsRepository;
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
public class AdsService implements ApplicationRepository, BindingRepository ,ServerHostRepository, UserRepository {
	
	@Autowired
	AdsRepository adsRepository;

	@Override
	@Transactional
	public void addUser(User user) {
		 adsRepository.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		 adsRepository.updateUser(user);
	}

	@Override
	@Transactional
	public User getUserByUserName(String userName) {
		return adsRepository.getUserByUserName(userName);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return adsRepository.getAllUsers();
	}

	@Override
	@Transactional
	public void deleteUser(String userName) {
		 adsRepository.deleteUser(userName);
	}

	@Override
	@Transactional
	public void addServerHost(ServerHost serverHost) {
		 adsRepository.addServerHost(serverHost);
	}

	@Override
	@Transactional
	public void updateServerHost(ServerHost serverHost) {
		 adsRepository.updateServerHost(serverHost);
	}

	@Override
	@Transactional
	public ServerHost getServerHostByName(String serverName) {
		return adsRepository.getServerHostByName(serverName);
	}

	@Override
	@Transactional
	public List<ServerHost> getAllServerHosts() {
		return adsRepository.getAllServerHosts();
	}

	@Override
	@Transactional
	public void deleteServerHost(String serverName) {
		 adsRepository.deleteServerHost(serverName);
	}

	@Override
	@Transactional
	public void addBinding(Binding binding) {
		 adsRepository.addBinding(binding);
	}

	@Override
	@Transactional
	public void updateBinding(Binding binding) {
		 adsRepository.updateBinding(binding);
	}

	@Override
	@Transactional
	public Binding getBindingById(String bindingId) {
		return adsRepository.getBindingById(bindingId);
	}

	@Override
	@Transactional
	public List<Binding> getAllBindings() {
		return adsRepository.getAllBindings();
	}

	@Override
	@Transactional
	public void deleteBinding(String bindingId) {
		 adsRepository.deleteBinding(bindingId);
	}

	@Override
	@Transactional
	public void addApplication(Application application) {
		 adsRepository.addApplication(application);
	}

	@Override
	@Transactional
	public void  updateApplication(Application application) {
		 adsRepository.updateApplication(application);
	}

	@Override
	@Transactional
	public Application getApplicationById(String applicationId) {
		return adsRepository.getApplicationById(applicationId);
	}

	@Override
	@Transactional
	public List<Application> getAllApplications() {
		return adsRepository.getAllApplications();
	}

	@Override
	@Transactional
	public void deleteApplication(String applicationId) {
		 adsRepository.deleteApplication(applicationId);
	}
}
