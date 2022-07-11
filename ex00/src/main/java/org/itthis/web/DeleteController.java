package org.itthis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.web.BookDeleteService;

@Controller
public class DeleteController {
	@Autowired
	private BookDeleteService bookdeleteservice;
	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void delete (Long booknum) {
		System.out.println("삭제요청"+booknum);
	 bookdeleteservice.delete(booknum);
		
	}
}
