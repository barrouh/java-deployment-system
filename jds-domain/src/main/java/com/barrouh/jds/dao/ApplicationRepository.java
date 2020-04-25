package com.barrouh.jds.dao;

import java.util.List;

import com.barrouh.jds.domain.Application;

/**
 * 
 * @author mbarrouh
 *
 */
public interface ApplicationRepository {
	
    void addApplication(Application application); 
    
    void updateApplication(Application application); 
    
    Application getApplicationByName(String applicationName); 
    
    List<Application> getAllApplications(); 
    
    void deleteApplication(String applicationId); 
}
