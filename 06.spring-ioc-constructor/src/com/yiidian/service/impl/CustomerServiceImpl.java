package com.yiidian.service.impl;

import com.yiidian.dao.CustomerDao;
import com.yiidian.service.CustomerService;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;

	//关键在这里，提供CustomerDao作为参数的构造方法，待会在配置文件进行注入
	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}


	@Override
	public void save() {
		customerDao.save();
	}

	


}
