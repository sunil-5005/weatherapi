package com.weatherapi.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WeatherapiApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WeatherapiApplication.class, args);
	}

}
