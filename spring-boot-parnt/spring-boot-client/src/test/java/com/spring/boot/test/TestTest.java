package com.spring.boot.test;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author jm.xiao
 * @date 2019/4/25
 */
@AAA("TestTest")
public class TestTest {
	public static void main(String[] args) {
		AnnotationUtils.clearCache();
		AAA a = AnnotatedElementUtils.getMergedAnnotation(TestTest.class, AAA.class);
		Configuration c = AnnotatedElementUtils.getMergedAnnotation(TestTest.class, Configuration.class);
		Component component = AnnotatedElementUtils.getMergedAnnotation(TestTest.class, Component.class);
		System.out.println(a);
		System.out.println(c);
		System.out.println(component);
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@interface AAA{

	@AliasFor(annotation = Component.class)
	String value() default "";
}
