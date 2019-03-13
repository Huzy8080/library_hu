package com.hotmail.huzy8080.library_hu.Pattern.singleton;

/**
 * 利用静态内部类实现的单例
 */
public class SingletonInner {
    private SingletonInner() {

    }

    public SingletonInner getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static SingletonInner instance = new SingletonInner();
    }


}
