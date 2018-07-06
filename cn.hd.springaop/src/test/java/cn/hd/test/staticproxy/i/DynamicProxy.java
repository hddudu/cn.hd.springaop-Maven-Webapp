package cn.hd.test.staticproxy.i;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	
	private Object target;//代理的目标对象
	
	public DynamicProxy(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
				this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before");
		Object result = method.invoke(target, args);
		System.out.println("after");
		return result;
	}

}
