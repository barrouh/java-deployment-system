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
@Table(name = "IP_ADDRESS")
public class IpAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "IP_ADDRESS", nullable = false)
	private String ip;
	
	@Column(name = "STATE", nullable = false)
	private String state;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "SERVER_ID", nullable = false)
	private ServerHost serverHost;

	public IpAddress() {
	}

	public IpAddress(String ip, String state, ServerHost serverHost) {
		this.ip = ip;
		this.state = state;
		this.serverHost = serverHost;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ServerHost getServerHost() {
		return serverHost;
	}

	public void setServerHost(ServerHost serverHost) {
		this.serverHost = serverHost;
	}

	@Override
	public String toString() {
		return "IpAddress [ip=" + ip + ", serverHost=" + serverHost + "]";
	}
	
}