package com.barrouh.jds.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "APPLICATION_ID", updatable = false, nullable = false)
	private Long applicationId;
    
	@Column(name = "APPLICATION_NAME", nullable = false)
    private String applicationName;
    
	@Column(name = "APPLICATION_TYPE", nullable = false)
    private String  applicationType;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "APPLICATION_USER", nullable = false)
	private User applicationUser;
    
	public Application() {
	}

	public Application(String applicationName, String applicationType) {
		this.applicationName = applicationName;
		this.applicationType = applicationType;
	}

	public Long getApplicationId() {
		return applicationId;
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

	public User getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(User applicationUser) {
		this.applicationUser = applicationUser;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationName=" + applicationName
				+ ", applicationType=" + applicationType + "]";
	}
    
}