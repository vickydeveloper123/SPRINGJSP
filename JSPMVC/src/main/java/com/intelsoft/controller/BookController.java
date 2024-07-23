package com.intelsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intelsoft.entity.Book;
import com.intelsoft.service.BookService;

@Controller
public class BookController {
	@Autowired
	public BookService bookService;
	
	
	@GetMapping("/lastchance")
	public ModelAndView getMapping() {
		
		ModelAndView view =new ModelAndView();
		
		List<Book> addingBooks = bookService.addingBooks();
		view.addObject("bookdata", addingBooks);
		view.setViewName("books");
		return view;
	}
	
	@GetMapping("/thanks")
	public String welcome() {
		return "Thank you ....";
	}

}
