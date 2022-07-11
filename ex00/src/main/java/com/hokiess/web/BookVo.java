package com.hokiess.web;

import org.springframework.stereotype.Component;

@Component
public class BookVo {
	private Long booknum;
	private String bookname;
	private String writer;
	private String publisher;
	private int price;
	private String image;
	private String introduce;
	
	public BookVo() {
		super();
	}

	public BookVo(Long booknum, String bookname, String writer, String publisher, int price, String introduce) {
		super();
		this.booknum = booknum;
		this.bookname = bookname;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.introduce = introduce;
	}
	
	public BookVo(Long booknum, String bookname, String writer, String publisher, int price,String image, String introduce) {
		super();
		this.booknum = booknum;
		this.bookname = bookname;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.image=image;
		this.introduce = introduce;
	}

	public Long getBooknum() {
		return booknum;
	}

	public void setBooknum(Long booknum) {
		this.booknum = booknum;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
}
