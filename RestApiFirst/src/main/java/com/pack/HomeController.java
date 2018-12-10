package com.pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
@GetMapping(value="/hellow/{username}",produces="text/html")
public String sayHellow(@PathVariable String username)
{
	return "<h1> Hellow " +username+ "</h1>"; 
}
}
