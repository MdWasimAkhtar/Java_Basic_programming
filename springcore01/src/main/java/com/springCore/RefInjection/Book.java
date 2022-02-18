package com.springCore.RefInjection;

public class Book {
	
	private int bookId;
	private String bookName;
	private Pages page;
	
	
	Book(){
		super();
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Pages getPage() {
		return page;
	}


	public void setPage(Pages page) {
		this.page = page;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", page=" + page + "]";
	}

	
	
}
