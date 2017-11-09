package com.yiidian.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @author http://www.yiidian.com
 *
 */
public class JDKProxyUtils {

	/**
	 * 使用JDK动态代理获取代理对象
	 * target: 目标对象
	 * @return
	 */
	public static Object getProxy(final Object target){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),    // 和目标对象一样的类加载器
				target.getClass().getInterfaces(), // 目标对象的接口列表
				new InvocationHandler() {
					
					//invoke: 这个方法在每次调用代理类对象的时候被执行啦！！！
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("记录日志");
						
						//调用目标对象的方法
						return method.invoke(target, args);
					}
				});
	}
}
