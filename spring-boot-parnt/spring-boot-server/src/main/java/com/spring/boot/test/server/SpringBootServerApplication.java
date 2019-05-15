package com.spring.boot.test.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author jm.xiao
 * @date 2019/4/24
 */
@SpringBootApplication(scanBasePackages = {
		"com.spring.boot.test.controller",
		"com.spring.boot.test.configuration",
		})
@MapperScan({"com.spring.boot.test.mapper"})
@EnableTransactionManagement
public class SpringBootServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootServerApplication.class, args);
	}
}
