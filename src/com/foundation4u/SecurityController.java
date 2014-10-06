package com.foundation4u;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		System.out.println("in securitycontorller login");
		ModelAndView model = new ModelAndView();
	
		model.setViewName("login");
 
		return model;
 
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("in securitycontorller home");
		ModelAndView model = new ModelAndView();
	
		model.setViewName("home");
 
		return model;
 
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout() {
		System.out.println("in securitycontorller logout");
		ModelAndView model = new ModelAndView();
	
		model.setViewName("logout");
 
		return model;
 
	}
	
	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public ModelAndView accessDenied() {
		System.out.println("in securitycontorller accessdenied");
		ModelAndView model = new ModelAndView();
	
		model.setViewName("accessdenied");
 
		return model;
 
	}
}
