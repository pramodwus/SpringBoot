package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private ApplicationContext ctx;
	public void run(String... args) throws Exception
	{
		HellowService hellow=(HellowService)ctx.getBean("hellowService");
		System.out.println(hellow.message());
	}
	public static void main(String args[])
	{
		SpringApplication.run(Application.class, args);
	}

}
