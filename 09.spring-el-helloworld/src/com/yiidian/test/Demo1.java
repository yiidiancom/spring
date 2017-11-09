package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiidian.dao.CustomerDao;

/**
 * @author http://www.yiidian.com
 * 
 */
public class Demo1 {

	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao)context.getBean("customerDao");
		System.out.println(customerDao);
	}

}
