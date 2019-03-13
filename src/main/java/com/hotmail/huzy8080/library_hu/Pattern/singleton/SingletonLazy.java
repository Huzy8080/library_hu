package com.hotmail.huzy8080.library_hu.Pattern.singleton;

/**
 * 懒加载
 * 每次获取都要先获得锁，并且会检查instance==null，性能不佳
 */
public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private SingletonLazy() {

    }

    public synchronized SingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}
