package com.hokiess.web;

import java.util.List;



public interface BookDaoim {

	public void update(BookVo bookvo);
	public void insert(BookVo bookvo);
	public Object selectByEmail(String num);
	public List<BookVo> selectAll();
	public int count();
	public BookVo selecById(Long numbernum);
	public void delete(Long booknum);
}