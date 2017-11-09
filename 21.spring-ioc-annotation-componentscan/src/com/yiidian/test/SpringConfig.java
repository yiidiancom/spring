package com.yiidian.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author http://www.yiidian.com
 *
 */
@Configuration
@ComponentScan(basePackages={"com.yiidian"}) //basePackages：可以放置一个或多个包扫描范围
public class SpringConfig {
}
