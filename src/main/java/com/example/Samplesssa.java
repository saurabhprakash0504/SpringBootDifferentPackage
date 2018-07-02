package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@Component("demoBeanD")
public class Samplesssa {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("waoaooaoaoa");
		return "samplerere";
	}
	
}
