package com.yiidian.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yiidian.dao.CustomerDao;
import com.yiidian.dao.impl.CustomerDaoImpl;

/**
 * @author http://www.yiidian.com
 *
 */
@Configuration
@ComponentScan(basePackages={"com.yiidian"}) 
public class SpringConfig {
	@Bean(name="customerDao") //获取getCustomerDao的返回对象，放入IOC容器中，并且起名为customerDao
	public CustomerDao getCustomerDao(){
		return new CustomerDaoImpl();
	}
}
