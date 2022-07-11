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
		System.out.println("�̸��߸� ���񽺱��� ��������");
		
		//BookVo bookvo = bookDao.selectByNum(command.getNumber());
		//
		//System.out.println("���� ������ �ñ��Ѱ� :"+bookvo);
		//if(bookvo != null) {
		//	throw new AlreadyExistingNumberException("�̹� �����ϴ� å:" + command.getNumber());
	//	}
		
		BookVo newBookVo = 
				new BookVo(
						command.getBooknum(), 
						command.getBookname(), 
						command.getWriter(), 
						command.getPublisher(),
						command.getPrice(),
						command.getIntroduce());
		System.out.println(command.getBooknum()+"�̰ŵ��߸� �Ѵܰ�����");  
		bookdao.update(newBookVo);
	
	}
	
	
}


