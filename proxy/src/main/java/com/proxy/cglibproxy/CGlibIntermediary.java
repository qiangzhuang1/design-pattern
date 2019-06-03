package com.proxy.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibIntermediary implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception{
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是中介，我要给你找房子，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("房子合适的话，准备签合同");
    }
}
