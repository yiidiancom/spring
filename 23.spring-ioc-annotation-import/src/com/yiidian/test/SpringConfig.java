package com.yiidian.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author http://www.yiidian.com
 *
 */
@Configuration
@ComponentScan(basePackages={"com.yiidian"}) 
@Import(JdbcConfig.class)
public class SpringConfig {
}
