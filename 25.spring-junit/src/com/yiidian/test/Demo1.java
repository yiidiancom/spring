package com.yiidian.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {
	
	//使用@Resource或者@Autowired进行注入
	@Resource
	private CustomerDao customerDao;
	
	@Test
	public void test1(){
		//不需要像以前这样加载spring配置了！
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao"); */
		customerDao.save();
	}
}
