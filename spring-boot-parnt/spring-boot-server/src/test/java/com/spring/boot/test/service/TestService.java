package com.spring.boot.test.service;

import com.spring.boot.test.configuration.TestScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jm.xiao
 * @date 2019/5/14
 */
@Component
public class TestService {

	private TestScopeService testScopeService;

	public TestScopeService getTestScopeService() {
		return testScopeService;
	}

	@Autowired
	public void setTestScopeService(TestScopeService testScopeService) {
		this.testScopeService = testScopeService;
	}
}
