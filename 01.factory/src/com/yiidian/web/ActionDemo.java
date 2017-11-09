package com.yiidian.web;

import com.yiidian.service.CustomerService;
import com.yiidian.service.impl.CustomerServiceImpl;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class ActionDemo {

	public static void main(String[] args) {
		//传统方式调用业务,直接new对象
		CustomerService customerService = new CustomerServiceImpl();
		customerService.save();
	}
}
