package com.pack.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pack.model.Employee;
import com.pack.service.IServiceDao;

@Controller
public class HomeController {
		@Autowired
		private IServiceDao service;
		
		//1.show the reg page
		@GetMapping("/reg")
		public String showPage(){
			return "register";
		}
		
		//2. save data
		@PostMapping(value="/insert")
		
		public String saveEmployee(@ModelAttribute("employee")Employee e,ModelMap m){
			//call service save
			boolean eid=service.saveEmployeeData(e);
			String msg="Saved with Id :";
			m.addAttribute("msg",msg);
			return "register";
		}
		@RequestMapping("/checkId")
		public @ResponseBody String checkIdData(@RequestParam("eid")int id){
			System.out.println(id);
			String msg="";
		     Optional<Employee> e=service.getDataById(id);
			if(e.isPresent())
			{
				msg=id+"  already exist in DB.";
			}
			return msg;
	}
		
	}

		


