package com.spring.boot.test.server;

import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jm.xiao
 * @date 2019/4/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootServerApplication.class, TestConfiguration.class})
public class TestBase implements ApplicationContextAware {
	private ApplicationContext applicationContext ;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
