package com.yiidian.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.yiidian.dao.AccountDao;
import com.yiidian.domain.Account;
/**
 * 
 * @author http://www.yiidian.com
 * 
 */
public class AccountDaoImpl extends HibernateDaoSupport  implements AccountDao{
	@Override
	public Account findAccountById(Integer id) {
		return this.getHibernateTemplate().get(Account.class, id);
	}

	@Override
	public Account findAccountByName(String name) {
		return (Account) this.getHibernateTemplate().find("from Account where name = ?", name).get(0);
	}

	@Override
	public void updateAccount(Account account) {
		this.getHibernateTemplate().update(account);
	}
}

