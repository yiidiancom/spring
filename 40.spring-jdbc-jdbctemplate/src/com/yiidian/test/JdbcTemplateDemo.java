package com.yiidian.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author http://www.yiidian.com
 * 
 */
public class JdbcTemplateDemo {

	@Resource
	private JdbcTemplate jt;

	/**
	 * 添加操作
	 */
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		// 保存
		jt.update("insert into account(name,money)values(?,?)","一点教程网", 5000);
	}

	/**
	 * 更新操作
	 */
	@Test
	public void test2() {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		// 修改
		jt.update("update account set money = money-? where id = ?", 200, 5);
	}

	/**
	 * 删除操作
	 */
	@Test
	public void test3() {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		// 删除
		jt.update("delete from account where id = ?", 6);
	}

	/**
	 * 查询所有操作
	 */
	@Test
	public void test4() {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		// 查询所有
		List<Account> accounts = jt.query(
				"select * from account where money > ? ",
				new AccountRowMapper(), 200);
		for (Account o : accounts) {
			System.out.println(o);
		}
	}

	public class AccountRowMapper implements RowMapper<Account> {
		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			account.setId(rs.getInt("id"));
			account.setName(rs.getString("name"));
			account.setMoney(rs.getFloat("money"));
			return account;
		}

	}

	/**
	 * 查询一个操作
	 */
	@Test
	public void test5() {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		// 查询一个
		List<Account> as = jt.query("select * from account where id = ? ",
				new AccountRowMapper(), 5);
		System.out.println(as.isEmpty() ? "没有结果" : as.get(0));
	}

	/**
	 * 查询返回一行一列操作
	 */
	@Test
	public void test6() {
		// 1.获取Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 2.根据id获取bean对象
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		// 3.执行操作
		// 查询返回一行一列：使用聚合函数，在不使用group by字句时，都是返回一行一列。最长用的就是分页中获取总记录条数
		Integer total = jt.queryForObject(
				"select count(*) from account where money > ? ", Integer.class,
				200);
		System.out.println(total);
	}
}
