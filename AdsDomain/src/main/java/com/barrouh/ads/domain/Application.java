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
@Table(name = "APPLICATION")
public class Application implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "APPLICATION_ID", nullable = false)
    private String applicationId;
    
	@Column(name = "APPLICATION_NAME", nullable = false)
    private String applicationName;
    
	@Column(name = "APPLICATION_NAME", nullable = false)
    private String  applicationType;
    
	public Application() {
	}

	public Application(String applicationId, String applicationName, String applicationType) {
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.applicationType = applicationType;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationName=" + applicationName
				+ ", applicationType=" + applicationType + "]";
	}
    
}
