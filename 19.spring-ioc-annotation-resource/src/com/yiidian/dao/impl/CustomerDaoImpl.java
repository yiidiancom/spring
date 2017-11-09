package com.yiidian.dao.impl;

import org.springframework.stereotype.Repository;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
@Repository(value="customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("执行了CustomerDaoImpl的save()方法");
	}
	
}
