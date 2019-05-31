package com.barrouh.ads.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
public class AdsService implements ApplicationRepository, BindingRepository ,ServerHostRepository, UserRepository {
	
	@Autowired
	AdsRepository adsRepository;

	@Override
	public int addUser(User user) {
		return adsRepository.addUser(user);
	}

	@Override
	public int updateUser(User user) {
		return adsRepository.updateUser(user);
	}

	@Override
	public User getUserByUserName(String userName) {
		return adsRepository.getUserByUserName(userName);
	}

	@Override
	public List<User> getAllUsers() {
		return adsRepository.getAllUsers();
	}

	@Override
	public int deleteUser(String userName) {
		return adsRepository.deleteUser(userName);
	}

	@Override
	public int addServerHost(ServerHost serverHost) {
		return adsRepository.addServerHost(serverHost);
	}

	@Override
	public int updateServerHost(ServerHost serverHost) {
		return adsRepository.updateServerHost(serverHost);
	}

	@Override
	public ServerHost getServerHostByName(String serverName) {
		return adsRepository.getServerHostByName(serverName);
	}

	@Override
	public List<ServerHost> getAllServerHosts() {
		return adsRepository.getAllServerHosts();
	}

	@Override
	public int deleteServerHost(String serverName) {
		return adsRepository.deleteServerHost(serverName);
	}

	@Override
	public int addBinding(Binding binding) {
		return adsRepository.addBinding(binding);
	}

	@Override
	public int updateBinding(Binding binding) {
		return adsRepository.updateBinding(binding);
	}

	@Override
	public Binding getBindingById(String bindingId) {
		return adsRepository.getBindingById(bindingId);
	}

	@Override
	public List<Binding> getAllBindings() {
		return adsRepository.getAllBindings();
	}

	@Override
	public int deleteBinding(String bindingId) {
		return adsRepository.deleteBinding(bindingId);
	}

	@Override
	public int addApplication(Application application) {
		return adsRepository.addApplication(application);
	}

	@Override
	public int updateApplication(Application application) {
		return adsRepository.updateApplication(application);
	}

	@Override
	public Application getApplicationById(String applicationId) {
		return adsRepository.getApplicationById(applicationId);
	}

	@Override
	public List<Application> getAllApplications() {
		return adsRepository.getAllApplications();
	}

	@Override
	public int deleteApplication(String applicationId) {
		return adsRepository.deleteApplication(applicationId);
	}
}
