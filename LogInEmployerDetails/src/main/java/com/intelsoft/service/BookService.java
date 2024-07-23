package com.intelsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intelsoft.entity.User;
import com.intelsoft.repository.BookRepo;

public class BookService {
	@Autowired
	private BookRepo bookrep;
	
	public List<User> gettingUserDetails(){
		
		List<User> all = bookrep.findAll();// Find all is method from JPA REPO, TO GET THE ALL THE RECORDS FROM THE DATABASE...
		
		return all;
	}
	
	

}
