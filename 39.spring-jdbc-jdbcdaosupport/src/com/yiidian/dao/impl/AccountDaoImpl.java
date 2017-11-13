package com.yiidian.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yiidian.dao.AccountDao;
/**
 * @author http://www.yiidian.com
 *
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	
	@Override
	public void save() {
		this.getJdbcTemplate().execute("insert into account(name,money)values('小泽',500)");
	}

}
