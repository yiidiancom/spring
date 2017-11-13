package com.yiidian.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * @author http://www.yiidian.com
 *
 */
public class JdbcTemplateDemo {
	public static void main(String[] args) {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		jt.execute("insert into account(name,money)values('小苍',500)");
	}
}
