package com.yiidian.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

/**
 * Spring的AOP的切面类
 * @author http://www.yiidian.com
 *
 */
public class MyAspect {

	/**
	 * 前置通知
	 * JoinPoint:代表当前拦截的方法对象，使用该对象可以获取拦截方法的信息（例如：类名，方法名，方法参数等）
	 */
	public void before(JoinPoint jp){
		System.out.println("执行了前置通知");
		System.out.println("代理对象类型："+jp.getThis().getClass());
		System.out.println("拦截的方法名称："+jp.getSignature().getName());
		System.out.println("拦截方法的参数列表："+Arrays.asList(jp.getArgs()));
	}

}
