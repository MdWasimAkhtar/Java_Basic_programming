package com.factoryDesign;

public class Windows implements Operating_Sys{

	@Override
	public void ram_size() {
		System.out.println("ram_Size = "+8+" GB");
	}
}
