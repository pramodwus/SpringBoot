package com.pack.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.annotation.*;

@SpringBootApplication(scanBasePackages= {"com.pack"})
//@PropertySource("messages.properties")
public class Aplication {
    
    
	public static void main(String[] args) {
		
		SpringApplication.run(Aplication.class, args);

	}

}
