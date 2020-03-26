package com.barrouh.ads.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "BINDING")
public class Binding implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "BINDING_ID", nullable = false)
	private Long bindingId;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "APPLICATION_ID", nullable = false)
	private Application application;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "SERVER_ID", nullable = false)
	private ServerHost serverHost;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "IP_ADDRESS", nullable = false)
	private IpAddress ipAddress;
	
	public Binding() {
	}

	public Binding(Application application, ServerHost serverHost, IpAddress ipAddress) {
		this.application = application;
		this.serverHost = serverHost;
		this.ipAddress = ipAddress;
	}

	public Long getBindingId() {
		return bindingId;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public ServerHost getServerHost() {
		return serverHost;
	}

	public void setServerHost(ServerHost serverHost) {
		this.serverHost = serverHost;
	}

	public IpAddress getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(IpAddress ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "Binding [bindingId=" + bindingId + ", application=" + application + ", serverHost=" + serverHost
				+ ", ipAddress=" + ipAddress + "]";
	}
	
}