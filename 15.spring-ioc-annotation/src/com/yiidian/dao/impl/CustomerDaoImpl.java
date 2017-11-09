package com.yiidian.dao.impl;

import org.springframework.stereotype.Component;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
@Component(value="customerDao")  //如果不加value，名称默认为类名：customerDaoImpl
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("测试SpringIOC的注解用法");
	}

}
