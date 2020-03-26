package com.barrouh.ads.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barrouh.ads.dao.ApplicationRepository;
import com.barrouh.ads.dao.BindingRepository;
import com.barrouh.ads.dao.IpAddressRepository;
import com.barrouh.ads.dao.ServerHostRepository;
import com.barrouh.ads.dao.UserRepository;
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
@Repository
public class JdsRepository implements ApplicationRepository, BindingRepository, ServerHostRepository, UserRepository, IpAddressRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private <T> T createQuery(Class<T> resultClass, String parameter, String value) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(resultClass);
		Root<T> root = query.from(resultClass);
		query.select(root);
		Predicate predicate = builder.equal(root.get(parameter), value);
		query.where(predicate);
		Query<T> q = getSession().createQuery(query);
		return q.uniqueResult();
	}

	private <T> List<T> createQuery(Class<T> resultClass) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(resultClass);
		Root<T> root = query.from(resultClass);
		query.select(root);
		Query<T> q = getSession().createQuery(query);
		if (!q.list().isEmpty()) {
			List<T> res = new ArrayList<>();
			res.add(q.getSingleResult());
			return res;
		} else {
			return q.list();
		}
	}

	@Override
	public void addUser(User user) {
		getSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}

	@Override
	public User getUserByUserName(String userName) {
		return createQuery(User.class, "userName", userName);
	}

	@Override
	public List<User> getAllUsers() {
		return createQuery(User.class);
	}

	@Override
	public void deleteUser(String userName) {
		getSession().delete(getUserByUserName(userName));
	}

	@Override
	public void addServerHost(ServerHost serverHost) {
		getSession().save(serverHost);
	}

	@Override
	public void updateServerHost(ServerHost serverHost) {
		getSession().update(serverHost);
	}

	@Override
	public ServerHost getServerHostByName(String serverName) {
		return createQuery(ServerHost.class, "serverName", serverName);
	}

	@Override
	public List<ServerHost> getAllServerHosts() {
		return createQuery(ServerHost.class);
	}

	@Override
	public void deleteServerHost(String serverName) {
		getSession().delete(getServerHostByName(serverName));
	}

	@Override
	public void addApplication(Application application) {
		getSession().save(application);
	}

	@Override
	public void updateApplication(Application application) {
		getSession().update(application);
	}

	@Override
	public Application getApplicationByName(String applicationName) {
		return createQuery(Application.class, "applicationName", applicationName);
	}

	@Override
	public List<Application> getAllApplications() {
		return createQuery(Application.class);
	}

	@Override
	public void deleteApplication(String applicationName) {
		getSession().delete(getApplicationByName(applicationName));
	}

	@Override
	public void addIpAddress(IpAddress ipAddress) {
		getSession().save(ipAddress);

	}

	@Override
	public void updateIpAddress(IpAddress ipAddress) {
		getSession().update(ipAddress);
	}

	@Override
	public IpAddress getIpAddressByIP(String ip) {
		return createQuery(IpAddress.class, "ip", ip);
	}

	@Override
	public List<IpAddress> getAllIpAddresss() {
		return createQuery(IpAddress.class);
	}

	@Override
	public void deleteIpAddress(String ip) {
		getSession().delete(getIpAddressByIP(ip));
	}

	@Override
	public void addBinding(Binding binding) {
		getSession().save(binding);
	}

	@Override
	public void updateBinding(Binding binding) {
		getSession().update(binding);
	}

	@Override
	public Binding getBindingById(Long bindingId) {
		return getSession().get(Binding.class, bindingId);
	}

	@Override
	public List<Binding> getAllBindings() {
		return createQuery(Binding.class);
	}

	@Override
	public void deleteBinding(Long bindingId) {
		getSession().delete(getBindingById(bindingId));
	}
}