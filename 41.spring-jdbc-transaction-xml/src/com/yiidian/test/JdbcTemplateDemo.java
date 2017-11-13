package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiidian.service.AccountService;

/**
 * @author http://www.yiidian.com
 * 
 */
public class JdbcTemplateDemo {

	/**
	 * 添加操作
	 */
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AccountService accountService = (AccountService)ac.getBean("accountService");
		accountService.transfer("小苍", "小泽", 300f);
	}


}
