package com.spring.boot.test.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author jm.xiao
 * @date 2019/4/29
 */
@Configuration
public class ServerConfiguration {

	/**
	 * 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	@Bean
	public Validator validator(){
		ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
				.configure()
				.failFast(true)
				.buildValidatorFactory();
		return validatorFactory.getValidator();
	}
}
