package com.rk.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rk.entity.User;
import com.rk.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;

	@GetMapping("/login")
	public String showLogin() {
		return "UserLogin";
	}
	
	@GetMapping("/setup")
	public String setup(HttpSession session, Principal p) 
	{
		
		//read current username
		String username = p.getName();

		//load user object
		User user = service.findByUsername(username).get();
		
		//store in HttpSession
		session.setAttribute("userOb", user);
		
		return "UserHome";
	}
}
