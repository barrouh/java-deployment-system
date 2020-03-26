package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.Application;

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
