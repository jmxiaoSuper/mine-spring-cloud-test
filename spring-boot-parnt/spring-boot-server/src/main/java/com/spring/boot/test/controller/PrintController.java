package com.spring.boot.test.controller;

import com.spring.boot.dto.User;
import com.spring.boot.test.view.UserVo;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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

	@RequestMapping("addUser")
	public UserVo addUser(@Valid UserVo vo, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			List<ObjectError> objectErrors = bindingResult.getAllErrors();
			objectErrors.forEach((o) -> System.err.println(o.getDefaultMessage()));
		}

		return vo;
	}

	@RequestMapping("modify")
	public UserVo modify(@Valid UserVo vo){
		return vo;
	}
}
