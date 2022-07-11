package com.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hokiess.web.BookDao;
@Service
public class BookDeleteService {
	@Autowired
	private BookDao bookdao;

	public void delete(Long booknum) {
		 bookdao.delete(booknum);
	}
}
