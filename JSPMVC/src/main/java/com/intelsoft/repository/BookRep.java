package com.intelsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intelsoft.entity.Book;

public interface BookRep  extends JpaRepository<Book, Integer>{
	
	

}
