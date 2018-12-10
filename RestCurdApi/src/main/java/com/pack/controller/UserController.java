package com.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.UserData;
import com.pack.reposistory.UserReposistory;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserReposistory repo;
	
	@GetMapping(value="/users",produces="application/json")
	
	public ResponseEntity<List<UserData>> getallUser()
	{
		List list=repo.findAll();
		return new ResponseEntity<List<UserData>>(list,HttpStatus.OK);
	}
	@GetMapping(value="/users/{userId}",produces="application/json")
	public ResponseEntity<UserData> getUserById(@PathVariable int userId)
	{
		
		Optional<UserData> user=repo.findById(userId);
		
	        UserData u=user.get();
		return new ResponseEntity<UserData>(u,HttpStatus.OK);
				
		
	}
	@PostMapping(value="/users/create",consumes="application/json")
	public UserData saveUser(@RequestBody UserData user)
	{
		 
		UserData str=repo.saveAndFlush(user);
		return user;
	}
	
	@PostMapping(value="/users/update/{userId}",consumes="application/json",produces="text/html")
	public String updateUser(@RequestBody UserData user,@PathVariable int userId)
	{
		 
		repo.saveAndFlush(user);
		return "<h1> record update sucessfully</h1>";
	}
	
	@GetMapping(value="/users/delete/{userId}",produces="text/html")
	public String deleteData(@PathVariable int userId)
	{
       repo.deleteById(userId);
       return "<h1>Record are delete sucessfully</h1>";
	}
	
	
	

	

}
