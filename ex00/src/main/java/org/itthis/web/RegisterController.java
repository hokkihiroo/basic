package org.itthis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.hokiess.web.CommandBook;
import com.service.web.BookRegisterService;

@Controller
public class RegisterController {
	
	private BookRegisterService bookRegisterService ;
	
	
	@Autowired
	public void setBookRegisterService(
			BookRegisterService bookRegisterService) {
		this.bookRegisterService=bookRegisterService;
				}
			
			

	@RequestMapping(value = "/addbook", method = RequestMethod.GET)
	public String addbook() {
		System.out.println("등록하러가기");
		return "addbook";
		
	}
	
	@RequestMapping(value = "/registerbook", method = RequestMethod.POST)
	public String registerbook(CommandBook command, MultipartFile file) {
		
	bookRegisterService.regist(command, file);
			return "sucess";
	}
}
