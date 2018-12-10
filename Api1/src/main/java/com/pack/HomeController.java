package com.pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController 
{
	@GetMapping(value="/hellow")
	public String sayHellow()
{
String h1="Durgesh";
return "<h1>"+h1+"</h>";
}
}
