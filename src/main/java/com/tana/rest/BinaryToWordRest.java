package com.tana.rest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BinaryToWordRest {
	
	private Logger LOGGER = Logger.getLogger(BinaryToWordRest.class);
	
	@GetMapping("/")
	public String index(){
		LOGGER.info("test index");
		return "index";
	}
	
}
