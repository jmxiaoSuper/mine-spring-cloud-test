package com.spring.boot.test.test;

import com.spring.boot.test.configuration.TestScopeService;
import com.spring.boot.test.server.TestBase;
import com.spring.boot.test.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author jm.xiao
 * @date 2019/5/14
 */
public class TestScopeUnit extends TestBase {

	@Autowired
	private TestService testService;

	@Test
	public void testScopeSingleton(){
		System.out.println(testService.getTestScopeService());
		TestScopeService ts = getApplicationContext().getBean(TestScopeService.class);
		TestScopeService ts2 = testService.getTestScopeService();
		TestScopeService ts3 = getApplicationContext().getBean(TestScopeService.class);
		System.out.println(ts.equals(ts2));
		System.out.println(ts == ts2);
		System.out.println(ts2 == ts3);
		System.out.println(ts2 == testService.getTestScopeService());
	}
}
