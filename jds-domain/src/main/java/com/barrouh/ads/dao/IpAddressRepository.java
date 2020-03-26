package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.IpAddress;

/**
 * 
 * @author mbarrouh
 *
 */
public interface IpAddressRepository {
	
    void addIpAddress(IpAddress ipAddress); 
    
    void updateIpAddress(IpAddress ipAddress); 
    
    IpAddress getIpAddressByIP(String ip); 
    
    List<IpAddress> getAllIpAddresss(); 
    
    void deleteIpAddress(String ip); 

}
