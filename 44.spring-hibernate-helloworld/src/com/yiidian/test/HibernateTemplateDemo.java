package com.yiidian.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

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
		HibernateTemplate ht = (HibernateTemplate) ac.getBean("hibernateTemplate");
		// 3.执行操作
		List<Account> list = ht.loadAll(Account.class);
		for (Account account : list) {
			System.out.println(account);
		}
	}
}
