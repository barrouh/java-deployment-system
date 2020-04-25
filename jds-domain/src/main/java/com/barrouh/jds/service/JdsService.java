package com.barrouh.jds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barrouh.jds.dao.ApplicationRepository;
import com.barrouh.jds.dao.BindingRepository;
import com.barrouh.jds.dao.IpAddressRepository;
import com.barrouh.jds.dao.ServerHostRepository;
import com.barrouh.jds.dao.UserRepository;
import com.barrouh.jds.dao.impl.JdsRepository;
import com.barrouh.jds.domain.Application;
import com.barrouh.jds.domain.Binding;
import com.barrouh.jds.domain.IpAddress;
import com.barrouh.jds.domain.ServerHost;
import com.barrouh.jds.domain.User;

/**
 * 
 * @author mbarrouh
 *
 */
@Service
public class JdsService implements ApplicationRepository, BindingRepository ,ServerHostRepository, UserRepository, IpAddressRepository {
	
	@Autowired
	private JdsRepository jdsRepository;

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
	public Binding getBindingById(Long bindingId) {
		return jdsRepository.getBindingById(bindingId);
	}

	@Override
	@Transactional
	public List<Binding> getAllBindings() {
		return jdsRepository.getAllBindings();
	}

	@Override
	@Transactional
	public void deleteBinding(Long bindingId) {
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
	public Application getApplicationByName(String applicationName) {
		return jdsRepository.getApplicationByName(applicationName);
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

	@Override
	@Transactional
	public void addIpAddress(IpAddress ipAddress) {
		jdsRepository.addIpAddress(ipAddress);
	}

	@Override
	@Transactional
	public void updateIpAddress(IpAddress ipAddress) {
		jdsRepository.updateIpAddress(ipAddress);
		
	}

	@Override
	@Transactional
	public IpAddress getIpAddressByIP(String ip) {
		return jdsRepository.getIpAddressByIP(ip);
	}

	@Override
	@Transactional
	public List<IpAddress> getAllIpAddresss() {
		return jdsRepository.getAllIpAddresss();
	}

	@Override
	@Transactional
	public void deleteIpAddress(String ip) {
		jdsRepository.deleteIpAddress(ip);
	}
}