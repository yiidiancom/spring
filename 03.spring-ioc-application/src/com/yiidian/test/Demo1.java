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
	public void test1(){
		//1.初始化SpringIOC容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器取出对象
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); 
		System.out.println(customerDao);
	}
}
