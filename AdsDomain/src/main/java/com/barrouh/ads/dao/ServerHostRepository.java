package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.ServerHost;

/**
 * 
 * @author mbarrouh
 *
 */
public interface ServerHostRepository {
	
	    int addServerHost(ServerHost serverHost); 
	    
	    int updateServerHost(ServerHost serverHost); 
	    
	    ServerHost getServerHostByName(String serverName); 
	    
	    List<ServerHost> getAllServerHosts(); 
	    
	    int deleteServerHost(String serverName);

}
