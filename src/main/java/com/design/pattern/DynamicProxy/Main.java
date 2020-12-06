package com.design.pattern.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class Main {

    public static void main(String[] args) {

        MyInvocationHandler handler = new MyInvocationHandler();

        handler.setHuman(new Male());
        Human male = (Human) Proxy.newProxyInstance(Human.class.getClassLoader(), new Class[]{Human.class}, handler);
        male.walk();

        handler.setHuman(new Female());
        Human female = (Human) Proxy.newProxyInstance(Human.class.getClassLoader(), new Class[]{Human.class}, handler);
        female.walk();

    }
}
