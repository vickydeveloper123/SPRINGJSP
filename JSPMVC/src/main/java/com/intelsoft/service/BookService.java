package com.intelsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelsoft.entity.Book;
import com.intelsoft.repository.BookRep;

@Service
public class BookService  {
	@Autowired
	public BookRep bookrep;
	
	
	public List<Book> addingBooks() {
		
		List<Book> all = bookrep.findAll();
		
		return all;
		
		
		
	}
	

}
