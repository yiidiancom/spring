package com.yiidian.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiidian.dao.AccountDao;
import com.yiidian.domain.Account;
/**
 * @author http://www.yiidian.com
 *
 */
public class HibernateTemplateDemo {
	public static void main(String[] args) {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.根据id获取bean对象
		AccountDao dao = (AccountDao)ac.getBean("accountDao");
		List<Account> list = dao.findAll();
		for (Account account : list) {
			System.out.println(account);
		}
	}
}
