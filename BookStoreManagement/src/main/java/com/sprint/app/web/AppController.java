package com.sprint.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.app.entity.User;
import com.sprint.app.service.IBookService;
import com.sprint.app.service.ILoginService;
import com.sprint.app.service.IUserService;

@RestController
@RequestMapping("/store")
public class AppController {
	
	@Autowired
	ILoginService loginService;
	
	@Autowired
	IBookService bookService;
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/user")
	public boolean addUser(@RequestBody User u)
	{
		loginService.addUser(u);
		return true;
	}
	
	
	@GetMapping("/user")
	public User getUser(@RequestParam int id) {
		
		User u=userService.getUser(id);
		
		if(u==null) {
			return null;
		}
		
		return u;
	}
}
