package com.pack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pack.dao.LoginDaoImpl;
import com.pack.model.LoginModel;

@Controller
public class LoginController {
private LoginModel imp;
	@Autowired
	private LoginDaoImpl dao;
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLogin()
	{
		return new ModelAndView("login","imp",new LoginModel());
				
	}
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public ModelAndView verify(@Valid@ModelAttribute("imp")LoginModel user,BindingResult br)
	
	{
		
		if(br.hasErrors())
		{
			return new ModelAndView("login");
		}
		else
		{
			
            
			String uname=user.getUsername();
			String password=user.getPasword();
			boolean b=dao.check(uname, password);
			
		    				
			if(b)
			{
				return new ModelAndView("sucess");
			}
			else
			{
				return new ModelAndView("failure");
			}
		}
	}
	
 
}
