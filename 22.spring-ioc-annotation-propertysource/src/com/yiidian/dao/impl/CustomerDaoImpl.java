package com.yiidian.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.yiidian.dao.CustomerDao;

/**
 * @author http://www.yiidian.com
 * 
 */
@Repository(value = "customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Value("${jdbcUrl}")
	private String jdbcUrl;
	@Value("${driverClass}")
	private String driverClass;
	@Value("${user}")
	private String user;
	@Value("${password}")
	private String password;

	@Override
	public String toString() {
		return "CustomerDaoImpl [jdbcUrl=" + jdbcUrl + ", driverClass="
				+ driverClass + ", user=" + user + ", password=" + password
				+ "]";
	}

	@Override
	public void save() {
		System.out.println("执行了CustomerDaoImpl的save()方法");
	}

}
