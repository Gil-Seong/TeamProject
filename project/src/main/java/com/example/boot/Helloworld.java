package com.example.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/help" ,method = RequestMethod.GET )
	public String help() {
		
		logger.debug("logback example - debug level");
		logger.info("logback example - info level");
		logger.warn("logback example - warn level");
		logger.error("logback example - error level");
		
		return "hello page";
	}
	
}
