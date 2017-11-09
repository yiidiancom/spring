package com.yiidian.service.impl;

import javax.annotation.Resource;

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
	@Resource(name="customerDao")
	private CustomerDao customerDao;

	@Override
	public void save() {
		customerDao.save();
	}
}
