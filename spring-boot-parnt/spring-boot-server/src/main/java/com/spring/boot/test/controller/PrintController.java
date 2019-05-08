package com.spring.boot.test.controller;

import com.spring.boot.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jm.xiao
 * @date 2019/4/24
 */
@RestController
public class PrintController {

	@RequestMapping("print")
	public User print(String name){
		System.out.println(name);
		User user = new User();
		user.setName(name).setAddress("ServerApplication");
		return user;
	}

}
