package com.yiidian.dao;

import java.util.List;

import com.yiidian.domain.Account;

/**
 * 
 * @author http://www.yiidian.com
 * 
 */
public interface AccountDao {

	public List<Account> findAll();
	
	public void save(Account account);
	
	public void update(Account account);
	
	public void findById(Integer id);
	
	public Long count();
	
	public List<Account> findByPage();
}
