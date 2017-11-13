package com.yiidian.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 * Spring的AOP的切面类
 * @author http://www.yiidian.com
 *
 */
@Aspect
public class MyAspect {

	@Before(value="execution(public * com.yiidian.service.impl.CustomerServiceImpl.*(..))")
	public void writeLog(){
		System.out.println("SpringAOP注解记录日志");
	}

}
