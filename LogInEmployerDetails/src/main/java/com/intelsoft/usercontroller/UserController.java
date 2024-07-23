package com.intelsoft.usercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.intelsoft.entity.User;
@Controller
public class UserController {
	@GetMapping("/")
	public String loadform(Model model) {
		User user=new User();
		model.addAttribute(user);
		return "application";// it is jsp
		
	}
	@PostMapping("/user")
	public String handleSubmit(User user,Model model) { // Entity class ...
		System.out.println(user);
		model.addAttribute("msg", "Employers Details sucessfully stored in the database...");
		return "sucess";// It will indicate jsp pages....
		
	}
	
	
	

}
