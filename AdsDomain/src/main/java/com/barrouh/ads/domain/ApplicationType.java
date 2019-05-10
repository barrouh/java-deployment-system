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
@Table(name = "APPLICATION_TYPE")
public class ApplicationType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "APPLICATION_TYPE", nullable = false)
	private String appType;
	
	public ApplicationType() {
	}

	public ApplicationType(String appType) {
		this.appType = appType;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	@Override
	public String toString() {
		return "ApplicationType [appType=" + appType + "]";
	}

}
