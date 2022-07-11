package org.itthis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.web.BookResponseService;

@Controller
public class ResponseController {
	
	private BookResponseService bookresponseservice;
	
	@Autowired
	public void setBookResponseService 
	(BookResponseService bookresponseservice) {
		this.bookresponseservice=bookresponseservice;
	}
	
	@RequestMapping(value = "/listbook", method = RequestMethod.GET)
	public String list(Model model) {
		System.out.println("리스트보기");
		model.addAttribute("booklist",bookresponseservice.selectAll());
		
		return "listbook";
	}
}
