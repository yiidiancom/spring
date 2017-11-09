package com.yiidian.test;

import org.junit.Test;

import com.yiidian.proxy.CglibProxyUtils;
import com.yiidian.service.CustomerServiceImpl;
/**
 * @author http://www.yiidian.com
 *
 */
public class Demo1 {
	/**
	 * 演示Cglib子类代理
	 */
	@Test
	public void test2(){
		//目标对象
		CustomerServiceImpl service = new CustomerServiceImpl();
		//获取子类代理对象
		CustomerServiceImpl proxy = (CustomerServiceImpl)CglibProxyUtils.getProxy(service);
		//调用代理对象
		proxy.save();
		proxy.update();
	}
	
}
