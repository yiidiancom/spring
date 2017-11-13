package com.yiidian.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.yiidian.dao.AccountDao;
import com.yiidian.domain.Account;
/**
 * 
 * @author http://www.yiidian.com
 * 
 */
@Repository("accountDao")
public class AccountDaoImpl extends HibernateDaoSupport  implements AccountDao{
	
	@Resource
	public void setMySessiionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
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

