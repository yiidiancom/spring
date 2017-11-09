package com.yiidian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yiidian.dao.CustomerDao;
import com.yiidian.service.CustomerService;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	@Qualifier("customerDao1")  //关键是@@Qualifier注解指定了名称
	private CustomerDao customerDao;

	@Override
	public void save() {
		customerDao.save();
	}
}
