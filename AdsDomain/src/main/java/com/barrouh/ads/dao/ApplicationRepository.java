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
    
    Application getApplicationById(String applicationId); 
    
    List<Application> getAllApplications(String applicationId); 
    
    void deleteApplication(String applicationId); 
}
