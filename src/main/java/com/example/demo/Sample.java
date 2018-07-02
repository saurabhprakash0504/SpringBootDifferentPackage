package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@RequestMapping("/helloss")
	
	public String hello() {
		System.out.println("subah");
		return "sample";
	}
	
}
