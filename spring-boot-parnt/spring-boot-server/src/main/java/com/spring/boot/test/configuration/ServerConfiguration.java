package com.spring.boot.test.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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

	/**
	 * ConfigurableBeanFactory.SCOPE_PROTOTYPE 原型配置的对象，如果被单例对象引用，在单例对象每次取也是同一实例
	 * 只有在applicationContext中根据类型获取实例 每次都是新的对象
	 * @return
	 */
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TestScopeService getScopeService(){
		return new TestScopeService();
	}
}
