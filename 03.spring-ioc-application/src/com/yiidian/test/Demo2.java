package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
public class Demo2 {
	
	@Test
	public void test1(){
		/**
		 * 方式一：类路径方式加载，默认在类路径的根目录下（也就是src目录下）
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); 
		System.out.println(customerDao);
	}
	
	@Test
	public void test2(){
		/**
		 * 方式二：使用文件系统的方式初始化ioc容器
		 */
		//2.1 绝对路径
		ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\workspaces\\yiidian_spring\\02.spring-ioc-helloworld\\src\\applicationContext.xml");
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); 
		System.out.println(customerDao);
	}
	
	@Test
	public void test3(){
		/**
		 * 方式二：使用文件系统的方式初始化ioc容器
		 */
		//2.2 相对路径
		ApplicationContext ac = new FileSystemXmlApplicationContext("./src/applicationContext.xml");
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); 
		System.out.println(customerDao);
	}
}
