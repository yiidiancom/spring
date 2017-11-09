package com.yiidian.aspect;

/**
 * Spring的AOP的切面类
 * @author http://www.yiidian.com
 *
 */
public class MyAspect {

	/**
	 * 通知方法
	 */
	public void writeLog(){
		System.out.println("使用spring的AOP切入日志...");
	}

}
