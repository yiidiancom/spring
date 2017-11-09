package com.yiidian.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author http://www.yiidian.com
 *
 */
@Configuration
@ComponentScan(basePackages={"com.yiidian"}) 
@PropertySource(value="classpath:jdbc.properties") //加载jdbc.properties文件，以便@Value注解获取文件值
public class SpringConfig {
}
