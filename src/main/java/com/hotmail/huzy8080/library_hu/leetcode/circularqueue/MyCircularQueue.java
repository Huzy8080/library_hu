package com.hotmail.huzy8080.library_hu.leetcode.circularqueue;

/**
 * 循环队列
 *      leetcode提供的解法中：
 *          1.使用了取余运算来将指针循环移动
 *          2.使用-1作初始下标，没有数组空间
 *
 */
public class MyCircularQueue {
    private Object[] array;
    private int front=0;
    private int rear=0;

    public MyCircularQueue(int k) {
        array =new Object[k+1];

    }
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front=1;
        }

        if(++rear>=array.length){
            rear=1;
        }
        array[rear]=value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        array[front]=null;
        if(front==rear){
            rear=front=0;
            return true;
        }
        if(++front>= array.length){
            front=1;
        }
        return true;

    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }else{
            return (int)array[front];
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return (int)array[rear];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front==0 && rear==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(front<rear){
            return front==1 && rear==array.length-1;
        }else{
            return front-rear==1;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        System.out.println(circularQueue.enQueue(1));    // 返回 true
        System.out.println(circularQueue.enQueue(2));    // 返回 true
        System.out.println(circularQueue.enQueue(3));    // 返回 true
        System.out.println(circularQueue.enQueue(4));    // 返回 false，队列已满
        System.out.println(circularQueue.Rear());               // 返回 3
        System.out.println(circularQueue.isFull());             // 返回 true
        System.out.println(circularQueue.deQueue());            // 返回 true
        System.out.println(circularQueue.enQueue(4));    // 返回 true
        System.out.println(circularQueue.Rear());               // 返回 4

    }
}
