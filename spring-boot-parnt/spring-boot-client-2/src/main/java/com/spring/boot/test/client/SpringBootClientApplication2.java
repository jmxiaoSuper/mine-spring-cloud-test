package com.spring.boot.test.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@SpringBootApplication
public class SpringBootClientApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClientApplication2.class, args);
	}

}
@RefreshScope
@RestController
class MessageRestController {

	@Value("${show.message:Hello default}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}
}
