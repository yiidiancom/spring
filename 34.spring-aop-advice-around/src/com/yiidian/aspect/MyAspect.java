package com.yiidian.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Spring的AOP的切面类
 * @author http://www.yiidian.com
 *
 */
public class MyAspect {

	/**
	 * 环绕通知
	 * ProceedingJoinPoint:
	 */
	public void afterThrowing(ProceedingJoinPoint pjp){
		System.out.println("开启事务");
		//调用目标对象方法
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("提交事务");
	}

}
