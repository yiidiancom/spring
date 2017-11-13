package com.yiidian.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yiidian.service.CustomerService;
/**
 * @author http://www.yiidian.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {

	@Resource
	private CustomerService customerService;
	
	@Test
	public void test1(){
		customerService.transfer(1000D);
	}
}
