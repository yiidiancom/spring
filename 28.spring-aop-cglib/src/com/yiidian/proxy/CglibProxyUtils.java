package com.yiidian.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import com.yiidian.service.CustomerServiceImpl;
/**
 * @author http://www.yiidian.com
 *
 */
public class CglibProxyUtils {

	/**
	 * 使用Cglib工具创建目标对象的子类对象
	 * @param target
	 * @return
	 */
	public static Object getProxy(final Object target){
		return Enhancer.create(CustomerServiceImpl.class, new MethodInterceptor() {
			//intercept：每次代理类对象执行方法的时候执行该方法
			@Override
			public Object intercept(Object arg0, Method method, Object[] arg2,
					MethodProxy arg3) throws Throwable {
				System.out.println("记录日志");
				//调用目标对象的方法
				return method.invoke(target, arg2);
			}
		});
	}
}
