package com.barrouh.jds.dao;

import java.util.List;

import com.barrouh.jds.domain.IpAddress;

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
