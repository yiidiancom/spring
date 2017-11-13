package com.yiidian.service.impl;

import org.springframework.stereotype.Service;

import com.yiidian.service.CustomerService;
/**
 * 这个类在AOP属于目标对象（Target)
 * @author http://www.yiidian.com
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void save(String name) {
		System.out.println("执行save方法,name为："+name);
	}

	@Override
	public void update() {
		System.out.println("执行update方法");
	}

}
