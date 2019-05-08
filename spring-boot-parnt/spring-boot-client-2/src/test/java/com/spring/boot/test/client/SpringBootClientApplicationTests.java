package com.spring.boot.test.client;

import com.spring.boot.test.service.PrintService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootClientApplicationTests {
	@Autowired
	private PrintService printService;

	@Test
	public void contextLoads() {
		printService.print();
		System.out.println("contextLoads");
	}

}
