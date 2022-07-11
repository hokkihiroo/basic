package org.itthis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hokiess.web.CommandBook;
import com.service.web.BookReadService;
import com.service.web.BookRepairService;

@Controller
public class RepairController {
	@Autowired
	private BookReadService bookReadService ;
	
	private BookRepairService bookrepairservice;
	
	@Autowired
	public void setBookRepairService(BookRepairService bookrepairservice) {
		this.bookrepairservice = bookrepairservice;
	}
	
			
	@RequestMapping(value = "/repair", method =RequestMethod.GET)
	public void repair(Long booknum, Model model) {
		System.out.println(booknum);
		model.addAttribute("bookvo",bookReadService.readbook(booknum));
		
	}
	
	
	@RequestMapping(value = "/repairok", method =RequestMethod.POST)
	public void  repairok(CommandBook command) {
		System.out.println(command);
		bookrepairservice.repair(command);
	}
	
}
