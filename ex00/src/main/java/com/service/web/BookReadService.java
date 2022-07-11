package com.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hokiess.web.BookDao;
import com.hokiess.web.BookVo;

@Service
public class BookReadService {

	@Autowired
	private BookDao bookdao;
	
	
	public BookVo readbook(Long num) {
		return bookdao.selecById(num);
	}
	
	
}
