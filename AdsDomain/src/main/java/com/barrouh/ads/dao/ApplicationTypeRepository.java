package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.ApplicationType;

/**
 * 
 * @author mbarrouh
 *
 */
public interface ApplicationTypeRepository {
	
    void addApplication(ApplicationType application); 
    
    List<ApplicationType> getAllApplications(String applicationType); 
    
    void deleteApplication(String applicationId); 
}
