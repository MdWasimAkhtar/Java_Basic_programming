package com.factoryDesign;

public class OsFactory {
	
	public Operating_Sys getInstance(String str) {
		
		if(str.equalsIgnoreCase("Apple"))
				return new Apple();
		else if (str.equalsIgnoreCase("Android"))
			return new Android();
		
		else if  (str.equalsIgnoreCase("Windows"))
			return new Windows();
		else
			return null;
		
	}
}
