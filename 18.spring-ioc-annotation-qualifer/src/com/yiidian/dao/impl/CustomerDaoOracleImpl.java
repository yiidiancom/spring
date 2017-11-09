package com.yiidian.dao.impl;

import org.springframework.stereotype.Repository;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
@Repository(value="customerDao2")
public class CustomerDaoOracleImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("customerDao的Oracle实现");
	}
	
}
