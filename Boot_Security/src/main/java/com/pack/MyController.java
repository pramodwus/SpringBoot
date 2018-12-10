package com.pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="/welcome")
	public  ModelAndView  sayWelcome()
	{
		return  new  ModelAndView("welcome");
	}
	@RequestMapping(value="/admin")
	public  ModelAndView   sayWelcomeToAdmin()
	{
		return new  ModelAndView("admin");
	}

}
