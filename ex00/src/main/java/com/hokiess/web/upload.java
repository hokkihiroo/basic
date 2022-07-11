package com.hokiess.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class upload {
	
	@RequestMapping(value="/user/multipartabc.do", method= {RequestMethod.POST})
	public String multipartabc(MultipartHttpServletRequest req, MultipartFile file) {
			
			System.out.println("abc");
			System.out.println("test");
			
			return "shooting/service/check_detail";
	}
}
