package com.yiidian.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * 
 * @author http://www.yiidian.com
 * 
 */
@PropertySource(value="classpath:jdbc.properties")
@EnableTransactionManagement  //开启Spring注解事务
public class JdbcConfig {
	@Value("${jdbc.driverClass}")
	private String driverClass;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	

	@Bean(name="dataSource")
	public DataSource getDataSource(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driverClass);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate(@Qualifier("dataSource")DataSource ds){
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(ds);
		return jt;
	}
	
	@Bean(name="transactionManager")
	public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("dataSource")DataSource ds){
		DataSourceTransactionManager manager = new DataSourceTransactionManager();
		manager.setDataSource(ds);
		return manager;
	}
}
