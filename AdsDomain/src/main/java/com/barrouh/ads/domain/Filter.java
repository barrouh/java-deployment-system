package com.barrouh.ads.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mbarrouh
 *
 */
public class Filter<T> {
	
	private Class<T> resultClass;
	
	private Map<String, Object> keysValues = new HashMap<>();
	
	public Filter() {
	}
	
	public Filter(Class<T> resultClass) {
		this.resultClass = resultClass;
	}

	public Filter(Class<T> resultClass, Map<String, Object> keysValues) {
		this.resultClass = resultClass;
		this.keysValues = keysValues;
	}

	public Class<T> getResultClass() {
		return resultClass;
	}

	public void setResultClass(Class<T> resultClass) {
		this.resultClass = resultClass;
	}

	public Map<String, Object> getKeysValues() {
		return keysValues;
	}

	public void setKeysValues(Map<String, Object> keysValues) {
		this.keysValues = keysValues;
	}
	
	public void addKeyValue(String key, Object value) {
		keysValues.put(key, value);
	}
	
	public void clearKeysValuesMap() {
		keysValues.clear();
	}

}
