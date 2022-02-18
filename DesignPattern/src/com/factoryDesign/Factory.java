package com.factoryDesign;

public class Factory {
	public static void main(String[] args) {
		
		OsFactory os1 = new OsFactory();
		os1.getInstance("Apple").ram_size();
		
		OsFactory os2 = new OsFactory();
		Operating_Sys oss = os2.getInstance("ows");
		oss.ram_size();
	}

}
