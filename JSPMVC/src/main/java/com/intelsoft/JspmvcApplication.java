package com.intelsoft;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.intelsoft.entity.Book;
import com.intelsoft.repository.BookRep;

@SpringBootApplication
public class JspmvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JspmvcApplication.class, args);
		System.out.println("-----Application get sucesfully connected--------");
		BookRep bean = run.getBean(BookRep.class);
		List<Book> all = bean.findAll();
		System.out.println("Retrieved Information from Database :"+all);
		System.out.println("----------------------");
		
		for(Book retrieved:all) {

			System.out.println("Data retrieved from the database :"+retrieved);
		}
		
	}

}
