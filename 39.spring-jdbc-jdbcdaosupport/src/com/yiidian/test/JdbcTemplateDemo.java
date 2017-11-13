package com.yiidian.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiidian.dao.AccountDao;
/**
 * @author http://www.yiidian.com
 *
 */
public class JdbcTemplateDemo {
	public static void main(String[] args) {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.根据id获取bean对象
		AccountDao dao = (AccountDao)ac.getBean("accountDao");
		// 3.执行操作
		dao.save();
	}
}
