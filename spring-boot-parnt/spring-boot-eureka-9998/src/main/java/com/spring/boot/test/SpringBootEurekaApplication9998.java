package com.spring.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jm.xiao
 * @date 2019/5/4
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaApplication9998 {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaApplication9998.class, args);
	}
}
