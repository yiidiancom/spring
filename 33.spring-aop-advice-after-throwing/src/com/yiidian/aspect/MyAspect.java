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
	 * 异常通知
	 * JoinPoint:代表当前拦截的方法对象，使用该对象可以获取拦截方法的信息（例如：类名，方法名，方法参数等）
	 * Throwable e： 该变量为目标方法传递过来的异常对象，里面包含异常信息
	 */
	public void afterThrowing(JoinPoint jp,Throwable e){
		System.out.println("执行了后置通知");
		System.out.println("代理对象类型："+jp.getThis().getClass());
		System.out.println("拦截的方法名称："+jp.getSignature().getName());
		System.out.println("拦截方法的参数列表："+Arrays.asList(jp.getArgs()));
		
		System.out.println("[一点教程网]邮件通知：系统发生错误，异常信息为："+e.getMessage());
	}

}
