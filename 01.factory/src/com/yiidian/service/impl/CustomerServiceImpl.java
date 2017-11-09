package com.yiidian.service.impl;

import com.yiidian.dao.CustomerDao;
import com.yiidian.ioc.BeanFactory;
import com.yiidian.service.CustomerService;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class CustomerServiceImpl implements CustomerService {
	//1.传统方法，直接new对象.
	//private CustomerDao customerDao = new CustomerDaoMySQLImpl();
	//private CustomerDao customerDao = new CustomerDaoOracleImpl(); //（弊端：耦合性太高，修改源代码）
	
	//2.IOC容器
	private CustomerDao customerDao = (CustomerDao) BeanFactory.getBean("customerDao");

	@Override
	public void save() {
		customerDao.save();
	}

}
