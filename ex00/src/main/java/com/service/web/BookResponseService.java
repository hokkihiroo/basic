package com.service.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hokiess.web.BookDao;
import com.hokiess.web.BookVo;
@Service
public class BookResponseService {
	@Autowired
	private BookDao bookdao;
	
	public List<BookVo> selectAll () {
		return bookdao.selectAll();
	}
}
