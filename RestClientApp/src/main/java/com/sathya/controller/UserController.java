package com.sathya.controller;

import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.entity.User;

@Controller

public class UserController 
{ 
	
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public ModelAndView getEmployeeInfo() {
		return new ModelAndView("getEmployees");
	}

	
	
	@GetMapping(value="/adduser")
    public  ModelAndView addUser()
    {
		return new ModelAndView("Addnewuser");
		
    }
	@PostMapping(value="/saveUser")
	public ModelAndView saveUser(HttpServletRequest request)
	{
		
		RestTemplate builder=new RestTemplate();
		User u=new User();
		u.setUserId(Integer.parseInt(request.getParameter("userId")));
		u.setGmail(request.getParameter("email"));
		u.setUserName(request.getParameter("userName"));
		builder.postForObject("http://localhost:4343/RequestApiCurd/users/create",u, String.class);
		
		return new ModelAndView("index","msg","Record Added sucessfully");
		
	}
	@GetMapping(value="/delete")
	public ModelAndView deleteUser()
	{
		return new ModelAndView("delete");
	}
	@PostMapping(value="/deleteUser")
	public ModelAndView deleteById(HttpServletRequest request)
	{
		RestTemplate builder=new RestTemplate();
		ResponseEntity<String> entity=builder.exchange("http://localhost:4343/RequestApiCurd/users/delete/"+request.getParameter("userId"),HttpMethod.GET,null,String.class);
		String message=entity.getBody();
		return new ModelAndView("index","msg1",message);
		
	}
	@GetMapping(value="/showUser")
	public ModelAndView showUser()
	{
		RestTemplate builder=new RestTemplate();
	//List userList=builder.getForObject("http://localhost:4343/RequestApiCurd/users",List.class);
	 
		 List<LinkedHashMap<User, List>> usersMap = builder.getForObject("http://localhost:4343/RequestApiCurd/users", List.class);
		 return new ModelAndView("display","data",usersMap);
		 
	}
    @GetMapping(value="/updateUser")
    public ModelAndView updateUser()
    {
    	return new ModelAndView("update");
    }
	
	
	@PostMapping(value="/update")
	public ModelAndView updateData(HttpServletRequest request)
	{
		
	User u=new User();
	u.setUserId(Integer.parseInt(request.getParameter("userId")));
	u.setGmail(request.getParameter("email"));
	u.setUserName(request.getParameter("userName"));
		
	
		RestTemplate builder=new RestTemplate();
      //ResponseEntity<User> user=builder.exchange("http://localhost:4343/RequestApiCurd/users/update/"+request.getParameter("userId"),HttpMethod.PUT,u,User.class);
		//builder."http://localhost:4343/RequestApiCurd/users/update/"+request.getParameter("userId"),
		HttpEntity<User> entity=new HttpEntity<User>(u);
		ResponseEntity<String> user=builder.exchange("http://localhost:4343/RequestApiCurd/users/update/"+request.getParameter("userId"),HttpMethod.POST,entity,String.class);
            		String str=user.getBody();

       		return new ModelAndView("index","msg1","message");
	}
	@GetMapping(value="/getUser")
	public  ModelAndView getUser()
	{
		return new ModelAndView("getUserById");
	}
	
	@PostMapping(value="getById")
	public ModelAndView getUserById(HttpServletRequest request)
	{
	
		RestTemplate builder=new RestTemplate();
		ResponseEntity<User> user=builder.exchange("http://localhost:4343/RequestApiCurd/users/"+request.getParameter("userId"),HttpMethod.GET,null,User.class);
	      User u=user.getBody();
	      return new ModelAndView("displaybyid","d",u);
	}
}