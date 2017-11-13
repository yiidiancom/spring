package com.yiidian.service;
/**
 * @author http://www.yiidian.com
 *
 */
public interface CustomerService {

	public void save(String name);
	
	public void update();
	
	/**
	 * 模拟转账方法
	 */
	public Double transfer(Double money);
}
