package com.yiidian.service;

/**
 * 这个类在AOP属于目标对象（Target)
 * 注意：该类没有实现任何接口
 * @author http://www.yiidian.com
 *
 */
public class CustomerServiceImpl{

	public void save() {
		System.out.println("执行save方法");
	}

	public void update() {
		System.out.println("执行update方法");
	}

}
