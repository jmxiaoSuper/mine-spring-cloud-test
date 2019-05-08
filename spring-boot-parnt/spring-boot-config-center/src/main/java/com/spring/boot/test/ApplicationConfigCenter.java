package com.spring.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 * @author Administrator
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationConfigCenter {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfigCenter.class, args);
	}
}
