package com.barrouh.jds.dao;

import java.util.List;

import com.barrouh.jds.domain.Binding;

/**
 * 
 * @author mbarrouh
 *
 */
public interface BindingRepository {
	
    void addBinding(Binding binding); 
    
    void updateBinding(Binding binding); 
    
    Binding getBindingById(Long bindingId); 
    
    List<Binding> getAllBindings(); 
    
    void deleteBinding(Long bindingId); 

}
