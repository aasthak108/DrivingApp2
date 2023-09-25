package com.aastha.drivingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication is equivalent to using
@ComponentScan, @Configuration and @EnableAutoConfiguration
*/
@SpringBootApplication
public class SpringBootApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootApp.class, args);
	}
}
