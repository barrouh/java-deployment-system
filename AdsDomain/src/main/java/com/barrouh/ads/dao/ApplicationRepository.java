package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.Application;

/**
 * 
 * @author mbarrouh
 *
 */
public interface ApplicationRepository {
	
    int addApplication(Application application); 
    
    int updateApplication(Application application); 
    
    Application getApplicationById(String applicationId); 
    
    List<Application> getAllApplications(); 
    
    int deleteApplication(String applicationId); 
}
