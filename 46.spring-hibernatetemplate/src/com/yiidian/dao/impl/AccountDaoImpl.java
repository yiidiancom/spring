package com.yiidian.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.yiidian.dao.AccountDao;
import com.yiidian.domain.Account;
/**
 * @author http://www.yiidian.com
 *
 */
public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {
	
	/**
	 * 查询所有
	 */
	@Override
	public List<Account> findAll() {
		return this.getHibernateTemplate().loadAll(Account.class);
	}

	/**
	 * 新增
	 */
	@Override
	public void save(Account account) {
		this.getHibernateTemplate().save(account);
	}

	/**
	 * 更新
	 */
	@Override
	public void update(Account account) {
		this.getHibernateTemplate().update(account);
	}

	/**
	 * 查询一个
	 */
	@Override
	public void findById(Integer id) {
		this.getHibernateTemplate().get(Account.class, id);
	}

	/**
	 * 统计
	 */
	@Override
	public Long count() {
		return this.getHibernateTemplate().execute(new HibernateCallback<Long>() {

			@Override
			public Long doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery("select count(*) from Account");
				return (Long)q.uniqueResult();
			}
		});
	}

	/**
	 * 分页
	 */
	@Override
	public List<Account> findByPage() {
		return this.getHibernateTemplate().execute(new HibernateCallback<List<Account>>() {

			@Override
			public List<Account> doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery("select * from Account");
				q.setFirstResult(1); //起始行数
				q.setMaxResults(3); //页面大小
				return q.list();
			}
		});
	}

}
