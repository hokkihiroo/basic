package com.hokiess.web;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao implements BookDaoim{
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	@Autowired
	public BookDao(SqlSessionTemplate sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public void update(BookVo bookvo) {
		sqlSessionTemplate.update("hoho.update", bookvo);
	}

	@Override
	public void insert(BookVo bookvo) {
		sqlSessionTemplate.insert("hoho.insert", bookvo);
	}

	@Override
	public Object selectByEmail(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVo> selectAll() {
		return sqlSessionTemplate.selectList("hoho.list");

	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BookVo selecById(Long number) {
		return sqlSessionTemplate.selectOne("hoho.read", number);
	}

	@Override
	public void delete(Long booknum) {
		sqlSessionTemplate.delete("hoho.delete",booknum);
	}
	

}
