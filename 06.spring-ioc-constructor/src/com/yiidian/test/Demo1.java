package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiidian.service.CustomerService;

/**
 * @author http://www.yiidian.com
 * 
 */
public class Demo1 {

	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService)context.getBean("customerService");
		customerService.save();
	}

}
