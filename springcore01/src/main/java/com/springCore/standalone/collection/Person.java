package com.springCore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	
	private Map<String , Integer>  feesStr;
	private Properties prop;
	
	public Person() {
		super();
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeesStr() {
		return feesStr;
	}

	public void setFeesStr(Map<String, Integer> feesStr) {
		this.feesStr = feesStr;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStr=" + feesStr + ", prop=" + prop + "]";
	}

	
}
