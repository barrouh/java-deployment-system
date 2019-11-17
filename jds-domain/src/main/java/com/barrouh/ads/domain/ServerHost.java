package com.barrouh.ads.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author mbarrouh
 *
 */
@Entity
@Table(name = "SERVER_HOST")
public class ServerHost implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SERVER_NAME", nullable = false)
	private String serverName;
	
	public ServerHost() {
	}

	public ServerHost(String serverName) {
		this.serverName = serverName;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	@Override
	public String toString() {
		return "ServerHost [serverName=" + serverName + "]";
	}
	
}
