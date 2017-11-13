package com.yiidian.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yiidian.config.SpringConfig;
import com.yiidian.service.AccountService;

/**
 * @author http://www.yiidian.com
 * 
 */
public class JdbcTemplateDemo {

	@Test
	public void test1() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountService accountService = (AccountService)ac.getBean("accountService");
		accountService.transfer("小苍", "小泽", 300f);
	}


}
