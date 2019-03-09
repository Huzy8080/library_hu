package com.hotmail.huzy8080.library_hu.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，要实现InvocationHandler，可在invoke方法中对代理方法增强
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        //before advice
        System.out.println("before advice...");

        result=method.invoke(target,args);

        //after advice
        System.out.println("after advice...");
        return result;
    }
}
