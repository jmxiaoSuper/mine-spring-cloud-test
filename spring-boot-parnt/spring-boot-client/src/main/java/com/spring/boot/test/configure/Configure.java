package com.spring.boot.test.configure;

import com.spring.boot.test.condition.LinuxConditionService;
import com.spring.boot.test.condition.WindowsConditionService;
import com.spring.boot.test.service.PrintService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;

/**
 * @author jm.xiao
 * @date 2019/4/24
 */
@Configuration
public class Configure {

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
		restTemplate.setInterceptors(
				Collections.singletonList(new LoggingRequestInterceptor()));

		return restTemplate;
	}

	@Bean
	@Conditional(WindowsConditionService.class)
	public PrintService getWindowPrintService() {
		return () -> System.out.println("this is windows");
	}

	@Bean
	@Conditional(LinuxConditionService.class)
	public PrintService getLinuxPrintService() {
		return () -> System.out.println("this is linux");
	}
}
