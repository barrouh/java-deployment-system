package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.Binding;

/**
 * 
 * @author mbarrouh
 *
 */
public interface BindingRepository {
	
    int addBinding(Binding binding); 
    
    int updateBinding(Binding binding); 
    
    Binding getBindingById(String bindingId); 
    
    List<Binding> getAllBindings(); 
    
    int deleteBinding(String bindingId); 

}
