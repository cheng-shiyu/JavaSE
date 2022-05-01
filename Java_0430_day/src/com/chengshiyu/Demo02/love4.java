package com.chengshiyu.Demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 线程交错打印
 */
public class love4 {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();
    private static boolean flag = true;
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                lock.lock();
                lock.lock();
                lock.lock();
                lock.lock();
                lock.lock();
                printTo();
                System.out.println( "lock调用了 " + lock.getHoldCount());
            } finally {
                lock.unlock();
                lock.unlock();
                lock.unlock();
                lock.unlock();
                lock.unlock();
            }
        });
        thread.start();

    }




    public static void printTo(){
        System.out.println(Thread.currentThread().getName() + "------> 执行");
    }

}


