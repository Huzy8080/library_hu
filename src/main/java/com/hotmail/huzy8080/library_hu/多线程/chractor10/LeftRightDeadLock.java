package com.hotmail.huzy8080.library_hu.多线程.chractor10;

public class LeftRightDeadLock {

    private final Object left = new Object();
    private final Object right = new Object();

    //先锁左,再锁右
    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                doSomething();
            }
        }
    }

    //先锁右,再锁左
    public void rightLeft() {
        synchronized (right) {
            synchronized (left) {
                doSomething();
            }
        }
    }


    private void doSomething() {

    }


}
