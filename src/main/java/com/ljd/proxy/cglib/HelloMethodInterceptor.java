package com.ljd.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by user34 on 2018/3/24.
 */
public class HelloMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodPorxy) throws Throwable {
        System.out.println("Before " + method.getName());
        Object object = methodPorxy.invokeSuper(o, objects);
        System.out.println("After " + method.getName());
        return object;
    }
}
