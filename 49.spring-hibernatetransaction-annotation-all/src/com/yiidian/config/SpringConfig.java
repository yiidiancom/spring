package com.yiidian.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring配置类
 * @author http://www.yiidian.com
 *
 */
@Configurable
@ComponentScan(basePackages="com.yiidian") //扫描注解类
@Import(value=JdbcConfig.class)  //导入其他配置类
public class SpringConfig {

}
