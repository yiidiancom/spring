package com.yiidian.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yiidian.domain.Account;
/**
 * 账户的封装类RowMapper的实现类
 * @author http://www.yiidian.com
 *
 */
public class AccountRowMapper implements RowMapper<Account>{
	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		account.setId(rs.getInt("id"));
		account.setName(rs.getString("name"));
		account.setMoney(rs.getFloat("money"));
		return account;
	}
}
