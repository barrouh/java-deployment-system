package com.barrouh.ads.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author mbarrouh
 *
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USERNAME", nullable = false)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "USER_TYPE", nullable = false)
	private String userType;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "SERVER_NAME", nullable = false)
	private ServerHost serverHost;
	
	public User() {
	}

	public User(String userName, String password, String userType, ServerHost serverHost) {
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.serverHost = serverHost;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public ServerHost getServerHost() {
		return serverHost;
	}

	public void setServerHost(ServerHost serverHost) {
		this.serverHost = serverHost;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", Usertype=" + userType + ", serverHost="
				+ serverHost + "]";
	}

}
