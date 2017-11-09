package com.yiidian.dao.impl;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	
	@Override
	public void save() {
		System.out.println("CustomerDaoImpl被成功注入！");
	}

}
