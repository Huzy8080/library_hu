package com.hotmail.huzy8080.library_hu.JDKDynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        Subject subject=new RealSubject();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(subject);
        //第一个参数是指定代理类的类加载器（我们传入当前测试类的类加载器）
        //第二个参数是代理类需要实现的接口（我们传入被代理类实现的接口，这样生成的代理类和被代理类就实现了相同的接口）
        //第三个参数是invocation handler，用来处理方法的调用。这里传入我们自己实现的handler
        Subject proxyInstance = (Subject)Proxy.newProxyInstance(Client.class.getClassLoader(), subject.getClass().getInterfaces(), myInvocationHandler);
        proxyInstance.doSomething();
    }
}
