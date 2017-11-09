package com.yiidian.dao.impl;

import com.yiidian.dao.CustomerDao;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class CustomerDaoMySQLImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("把客户数据保存到mysql数据");
	}

}
