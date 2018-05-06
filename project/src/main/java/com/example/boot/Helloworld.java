package com.example.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@RequestMapping("/")
	public String hello() {
		
		return "hello world";
	}
	
}
