package com.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hokiess.web.BookDao;
import com.hokiess.web.BookVo;
import com.hokiess.web.CommandBook;

@Service
public class BookRepairService {
	
	@Autowired
	private BookDao bookdao;
	
	public void repair(CommandBook command) {
		System.out.println(command.getBookname());
		System.out.println("이름뜨면 서비스까진 문제없음");
		
		//BookVo bookvo = bookDao.selectByNum(command.getNumber());
		//
		//System.out.println("뭐가 담겼는지 궁금한것 :"+bookvo);
		//if(bookvo != null) {
		//	throw new AlreadyExistingNumberException("이미 존재하는 책:" + command.getNumber());
	//	}
		
		BookVo newBookVo = 
				new BookVo(
						command.getBooknum(), 
						command.getBookname(), 
						command.getWriter(), 
						command.getPublisher(),
						command.getPrice(),
						command.getIntroduce());
		System.out.println(command.getBooknum()+"이거도뜨면 한단계진보");  
		bookdao.update(newBookVo);
	
	}
	
	
}


