package com.hotmail.huzy8080.library_hu.concurrent.reentrantLock;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 原子类的操作都是原子性的
 * 两种竞条件:
 * 1.检查-执行
 * 2.读取-修改-写入
 * 普通的i++操作属于第二种.有两个时间段会产生难以预期的结果
 * <p>
 * 线程安全都发生在有状态的类中.无状态对象一定是线程安全的.
 * 原子操作能保证线程的安全,要保持状态的一致性,就需要在单个原子
 * 操作中更新所有相关的状态变量
 * 如果两个状态变量之间存在依赖关系,那么应该使操作这两个变量
 * 的操作成为原子性操作
 * JAVA提供了一种内置的锁机制来支持原子性:同步代码块,这种锁称为内置锁
 * 或者监视器锁,它是一种互斥锁,即最多只有一个线程持有锁.由此将会产生内置锁
 * 的几个问题:死锁,活锁,饥饿
 */
public class AtomicTest implements Runnable {

    private long count = 0;
    private AtomicLong atomicLong = new AtomicLong(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {

            count++;
            atomicLong.incrementAndGet();
        }
    }

    public long getCount() {
        return count;
    }

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicTest atomicTest = new AtomicTest();
        Thread t1 = new Thread(atomicTest);
        Thread t2 = new Thread(atomicTest);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("UnSafe: " + atomicTest.getCount());
        System.out.println("Atomic: " + atomicTest.getAtomicLong());
    }

}
