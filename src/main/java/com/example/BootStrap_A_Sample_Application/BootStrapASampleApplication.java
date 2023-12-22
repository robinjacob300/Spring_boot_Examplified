package com.example.BootStrap_A_Sample_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*","trolls.*"})
@PropertySource(value = {"classpath:application.properties"} )
public class BootStrapASampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStrapASampleApplication.class, args);
	}

}
