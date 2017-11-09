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
	
	/**
	 * 测试singleton
	 */
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		for(int i=0;i<=4;i++){
			CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); 
			System.out.println(customerDao);
		}
	}
	
	/**
	 * 测试"prototype"
	 */
	@Test
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		for(int i=0;i<=4;i++){
			CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); 
			System.out.println(customerDao);
		}
	}
}
