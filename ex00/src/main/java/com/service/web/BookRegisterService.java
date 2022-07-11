package com.service.web;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hokiess.web.BookDao;
import com.hokiess.web.BookVo;
import com.hokiess.web.CommandBook;

@Service
public class BookRegisterService {
	private BookDao bookDao;
	private static final String FILEPATH = "C:\\WORKJAVA\\stswork\\ex00\\src\\main\\webapp\\resources\\image";
	@Autowired
	public  BookRegisterService(BookDao bookDao) {
		System.out.println("book��� ���� ����");
		this.bookDao = bookDao;
	}
	
	
	public void regist(CommandBook command, MultipartFile file) {
		
		//BookVo bookvo = bookDao.selectByNum(command.getNumber());
		//
		//System.out.println("���� ������ �ñ��Ѱ� :"+bookvo);
		//if(bookvo != null) {
		//	throw new AlreadyExistingNumberException("�̹� �����ϴ� å:" + command.getNumber());
	//	}
		
		file=command.getImage();
		if (!file.isEmpty()) {
			try {
				file.transferTo(new File (FILEPATH,command.getImage().getOriginalFilename()));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String image =file.getOriginalFilename();
		
		BookVo newBookVo = 
				new BookVo(
						command.getBooknum(), 
						command.getBookname(), 
						command.getWriter(), 
						command.getPublisher(),
						command.getPrice(),
						image,
						command.getIntroduce());
		System.out.println(command.getBooknum()+"�̰ŵ��߸� �Ѵܰ�����");  
		bookDao.insert(newBookVo);
	
	}
	
	
}
