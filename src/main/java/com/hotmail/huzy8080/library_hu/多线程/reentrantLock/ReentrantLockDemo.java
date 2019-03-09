package com.hotmail.huzy8080.library_hu.多线程.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;


public class ReentrantLockDemo implements Runnable {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    int lock;

    public ReentrantLockDemo(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            if (lock == 1) {
                lock1.lockInterruptibly();
                sleep(500);
                lock2.lockInterruptibly();
            } else {
                lock2.lockInterruptibly();
                sleep(500);
                lock1.lockInterruptibly();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
            if (lock2.isHeldByCurrentThread()) {
                lock2.unlock();
            }
            System.out.println(currentThread().getId() + " exit!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockDemo demo1 = new ReentrantLockDemo(1);
        ReentrantLockDemo demo2 = new ReentrantLockDemo(2);

        Thread t1 = new Thread(demo1);
        Thread t2 = new Thread(demo2);
        t1.start();
        t2.start();
        sleep(1000);
        t2.interrupt();
    }

}
