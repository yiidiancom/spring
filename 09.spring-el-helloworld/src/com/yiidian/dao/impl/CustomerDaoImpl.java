package com.yiidian.dao.impl;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
/**
 * @author http://www.yiidian.com
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	
	private Customer customer;
	private String custName;
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "CustomerDaoImpl [customer=" + customer + ", custName=" + custName + "]";
	}
	
}
