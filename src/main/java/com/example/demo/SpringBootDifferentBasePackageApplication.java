package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Samplesssa;

@SpringBootApplication
@ComponentScan(basePackageClasses = Samplesssa.class)
public class SpringBootDifferentBasePackageApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDifferentBasePackageApplication.class, args);
		System.out.println("Contains A  " + context.containsBeanDefinition("demoBeanD"));
	}
}
