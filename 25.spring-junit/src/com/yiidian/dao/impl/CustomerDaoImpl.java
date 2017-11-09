package com.yiidian.dao.impl;

import org.springframework.stereotype.Component;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
@Component(value="customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("测试Spring整合Junit用法");
	}

}
