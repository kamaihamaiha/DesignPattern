package com.design.pattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类和委托类中间的中介类【调用处理器】
 */
public class MyInvocationHandler implements InvocationHandler {
    private Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(human,args);
        System.out.println("after");
        return result;
    }
}
