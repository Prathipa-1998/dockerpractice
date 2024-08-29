package com.example.docker.dockerpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class TestController {
	
	@GetMapping("test")
	public String textMessage()
	{
		return "hi welcome to my first docker file";
	}

}
