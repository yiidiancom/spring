package com.yiidian.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Spring的AOP的切面类
 * 
 * @author http://www.yiidian.com
 * 
 */
@Aspect
@Component
public class MyAspect {

	// 前置通知
	@Before(value = "execution(public * com.yiidian.service.impl.CustomerServiceImpl.*(..))")
	public void before() {
		System.out.println("前置通知");
	}

	// 最终通知
	@After(value = "execution(public * com.yiidian.service.impl.CustomerServiceImpl.*(..))")
	public void after() {
		System.out.println("最终通知");
	}

	// 后置通知
	@AfterReturning(value = "execution(public * com.yiidian.service.impl.CustomerServiceImpl.*(..))")
	public void afterReturning() {
		System.out.println("后置通知");
	}

	// 异常通知
	@AfterThrowing(value = "execution(public * com.yiidian.service.impl.CustomerServiceImpl.*(..))")
	public void afterThrowing() {
		System.out.println("异常通知");
	}

	// 环绕通知
	@Around(value = "execution(public * com.yiidian.service.impl.CustomerServiceImpl.*(..))")
	public void around(ProceedingJoinPoint pjp) {
		System.out.println("前置通知--前面代码");
		//执行目标对象方法
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("前置通知--后面代码");
	}

}
