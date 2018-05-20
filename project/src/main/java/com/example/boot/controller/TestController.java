package com.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

		@RequestMapping(value="test", method=RequestMethod.GET)
		public String hello2() {
			
			return "views/test";
		}
		
}

