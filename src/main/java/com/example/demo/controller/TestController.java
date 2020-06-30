package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan({ "com.example.demo" })
public class TestController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() throws Exception {

		return "Hello There!!!";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getR() throws Exception {

		return "Hello There, it's test!";
	}
}