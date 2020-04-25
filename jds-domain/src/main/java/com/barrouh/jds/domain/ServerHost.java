package com.barrouh.jds.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "SERVER_ID", updatable = false, nullable = false)
	private Long serverId;
	
	@Column(name = "SERVER_NAME", nullable = false)
	private String serverName;
	
	public ServerHost() {
	}

	public ServerHost(String serverName) {
		this.serverName = serverName;
	}
	
	public Long getServerId() {
		return serverId;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	@Override
	public String toString() {
		return "ServerHost [serverId=" + serverId + ", serverName=" + serverName + "]";
	}

}