package com.aj.basicspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSpringBootApplication {

    private static final Logger logger = LoggerFactory.getLogger(BasicSpringBootApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BasicSpringBootApplication.class,args);
	}
}
