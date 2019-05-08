package com.spring.boot.test.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author jm.xiao
 * @date 2019/4/25
 */
public class WindowsConditionService implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println(context.getEnvironment().getProperty("os.name"));
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}
}
