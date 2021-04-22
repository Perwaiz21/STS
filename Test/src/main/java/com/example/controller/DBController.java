package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

	@RequestMapping(value ="/test")
	public String testDB() {
		return "OK";
	}
	
}
