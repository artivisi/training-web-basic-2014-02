package com.artivisi.belajar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/config/user/list")
	public ModelAndView configUserList() {
		ModelAndView mm = new ModelAndView();
		
		return mm;
	}
	
	@RequestMapping("/config/user/form")
	public ModelAndView configUserForm() {
		ModelAndView mm = new ModelAndView();
		
		return mm;
	}
	
	@RequestMapping("/config/user/view")
	public ModelAndView configUserView() {
		ModelAndView mm = new ModelAndView();
		
		return mm;
	}
}
