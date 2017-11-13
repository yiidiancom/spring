package com.yiidian.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.yiidian.dao.AccountDao;
import com.yiidian.domain.Account;
/**
 * 
 * @author http://www.yiidian.com
 * 
 */
@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport  implements AccountDao{
	
	@Resource
	public void setMyDataSource(DataSource ds){
		super.setDataSource(ds);
	}
	
	
	@Override
	public Account findAccountById(Integer id) {
		List<Account> list = getJdbcTemplate().query("select * from account where id = ? ",new AccountRowMapper(),id);
		return list.isEmpty()?null:list.get(0);
	}

	@Override
	public Account findAccountByName(String name) {
		List<Account> list =  getJdbcTemplate().query("select * from account where name = ? ",new AccountRowMapper(),name);
		if(list.isEmpty()){
			return null;
		}
		if(list.size()>1){
			throw new RuntimeException("结果集不唯一，不是只有一个账户对象");
		}
		return list.get(0);
	}

	@Override
	public void updateAccount(Account account) {
		getJdbcTemplate().update("update account set money = ? where id = ? ",account.getMoney(),account.getId());
	}
}

