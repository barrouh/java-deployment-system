package com.barrouh.ads.dao;

import java.util.List;

import com.barrouh.ads.domain.Binding;

/**
 * 
 * @author mbarrouh
 *
 */
public interface BindingRepository {
	
    void addBinding(Binding binding); 
    
    void updateBinding(Binding binding); 
    
    Binding getBindingById(String bindingId); 
    
    List<Binding> getAllBindings(); 
    
    void deleteBinding(String bindingId); 

}
