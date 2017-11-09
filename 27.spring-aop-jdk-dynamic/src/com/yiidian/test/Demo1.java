package com.yiidian.test;

import org.junit.Test;

import com.yiidian.proxy.JDKProxyUtils;
import com.yiidian.service.CustomerService;
import com.yiidian.service.impl.CustomerServiceImpl;
/**
 * @author http://www.yiidian.com
 *
 */
public class Demo1 {
	
	@Test
	public void test1(){
		//目标对象
		CustomerService service = new CustomerServiceImpl();
		//获取JDK动态代理对象（接口代理）
		CustomerService proxy = (CustomerService)JDKProxyUtils.getProxy(service);
		//调用代理对象
		proxy.save();
		proxy.update();
	}
	
}
