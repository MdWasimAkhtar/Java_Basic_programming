package com.springCore.RefInjection;

public class Pages {
	
	private int pages;
	
	
	Pages(){
		super();
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	@Override
	public String toString() {
		return "Pages [pages=" + pages + "]";
	}
	
	

}
