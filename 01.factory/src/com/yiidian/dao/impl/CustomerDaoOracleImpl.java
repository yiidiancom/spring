package com.yiidian.dao.impl;

import com.yiidian.dao.CustomerDao;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class CustomerDaoOracleImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("保存客户数据保存Oracle");
	}

}
