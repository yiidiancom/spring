package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yiidian.dao.CustomerDao;

public class Demo1 {
	@Test
	public void test1(){
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao");
		customerDao.save();
	}
}
