package com.yiidian.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring配置类
 * @author http://www.yiidian.com
 *
 */
@Configurable
@ComponentScan(basePackages="com.yiidian")
@EnableAspectJAutoProxy  // 开启AOP注解功能
public class SpringConfig {

}
