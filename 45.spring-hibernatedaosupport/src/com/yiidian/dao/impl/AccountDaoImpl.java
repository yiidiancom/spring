package com.yiidian.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.yiidian.dao.AccountDao;
import com.yiidian.domain.Account;
/**
 * @author http://www.yiidian.com
 *
 */
public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {
	
	@Override
	public List<Account> findAll() {
		return this.getHibernateTemplate().loadAll(Account.class);
	}

}
