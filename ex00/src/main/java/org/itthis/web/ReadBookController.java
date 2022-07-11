package org.itthis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.web.BookReadService;

@Controller
public class ReadBookController {
	@Autowired
	private BookReadService bookReadService ;
	
	
	@RequestMapping(value = "/readbook", method =RequestMethod.GET)
	public void read(Long booknum, Model model) {
		model.addAttribute("bookvo",bookReadService.readbook(booknum));
		
	}
}
