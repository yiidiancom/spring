package com.yiidian.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
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
	
	@Bean(name="sessionFactory")
	public LocalSessionFactoryBean getJdbcTemplate(@Qualifier("dataSource")DataSource ds){
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(ds);
		Properties props = new Properties();
		props.setProperty("hibernate.shql_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		factory.setPackagesToScan("com.yiidian.domain");
		factory.setHibernateProperties(props);
		return factory;
	}
	
	@Bean(name="transactionManager")
	public HibernateTransactionManager getDataSourceTransactionManager(@Qualifier("sessionFactory")SessionFactory sessionFactory){
		HibernateTransactionManager manager = new HibernateTransactionManager();
		manager.setSessionFactory(sessionFactory);
		return manager;
	}
}
