package com.tana.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinaryToWordRest {
	
	private Logger LOGGER = Logger.getLogger(BinaryToWordRest.class);
	
	@RequestMapping(value="/testRest",method = RequestMethod.GET)
	public ResponseEntity<String> getDetail() {
		LOGGER.info("HERE WE ARE!");
		return new ResponseEntity<>("Test REST",HttpStatus.OK);
	}
}
