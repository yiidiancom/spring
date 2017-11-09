package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
	@Test
	public void test1(){
		//@Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
	}
}
