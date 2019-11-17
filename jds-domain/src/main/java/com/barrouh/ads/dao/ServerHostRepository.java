package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.ServerHost;

/**
 * 
 * @author mbarrouh
 *
 */
public interface ServerHostRepository {
	
	    void addServerHost(ServerHost serverHost); 
	    
	    void updateServerHost(ServerHost serverHost); 
	    
	    ServerHost getServerHostByName(String serverName); 
	    
	    List<ServerHost> getAllServerHosts(); 
	    
	    void deleteServerHost(String serverName);
}