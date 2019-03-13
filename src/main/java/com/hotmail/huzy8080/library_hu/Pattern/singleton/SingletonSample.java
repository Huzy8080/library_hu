package com.hotmail.huzy8080.library_hu.Pattern.singleton;

/**
 * 饿加载的单例，线程安全，服务启动时就会加载
 */
public class SingletonSample {

    private static SingletonSample INSTANCE = new SingletonSample();

    private SingletonSample() {

    }

    public static SingletonSample getInstance() {
        return INSTANCE;
    }
}
