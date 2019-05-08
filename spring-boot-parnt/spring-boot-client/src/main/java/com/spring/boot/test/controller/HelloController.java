package com.spring.boot.test.controller;

import com.spring.boot.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jm.xiao
 * @date 2019/4/24
 */
@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;

	private String host = "http://127.0.0.1:9100/server";

	@RequestMapping("sayHello")
	public User sayHello(String name) {
		System.out.println(name);
		Map<String, String> map = new HashMap<>();
		map
				.put("name", name
						+ " from client");
		return restTemplate.getForObject(host + "/print", User.class, map);
	}

}
