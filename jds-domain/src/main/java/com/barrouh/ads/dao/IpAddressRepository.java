package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.IpAddress;

/**
 * 
 * @author mbarrouh
 *
 */
public interface IpAddressRepository {
	
    int addIpAddress(IpAddress ipAddress); 
    
    int updateIpAddress(IpAddress ipAddress); 
    
    IpAddress getIpAddressByIP(String ip); 
    
    List<IpAddress> getAllIpAddresss(); 
    
    int deleteIpAddress(String ipAddressId); 

}
