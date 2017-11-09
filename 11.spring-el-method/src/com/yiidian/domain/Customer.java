package com.yiidian.domain;

import java.io.Serializable;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class Customer implements Serializable{
	private String name;
	private Double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + "]";
	}
	
}
	