package com.vg.app1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Spring Boot Application - Valle Grande Taller";
	}

}
