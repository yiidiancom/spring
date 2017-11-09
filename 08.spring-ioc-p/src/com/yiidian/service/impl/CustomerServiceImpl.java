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

	//使用p名称注入，也需要提供setter方法，只不过p名称空间简化了setter方法注入
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public void save() {
		customerDao.save();
	}

}
