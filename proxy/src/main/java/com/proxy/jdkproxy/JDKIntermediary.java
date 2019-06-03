package com.proxy.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 房屋中介
 */
public class JDKIntermediary implements InvocationHandler {
    //被代理的对象，把引用给保存下来
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("房屋中介，已经确认客户的要求");
        System.out.println("开始物色房子");
    }

    private void after(){
        System.out.println("房子合适的话，和客户签协议");
    }
}