package com.chengshiyu.Demo01;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30
 * ReentrantLock 利用lockInterruptibly解决死锁问题.
 */
public class love6 {
    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            t1(4);
        });
        Thread thread1 = new Thread(() -> {
            t1(3);
        });
        thread1.start();
        thread.start();

        // 如果等待时间超过3秒，就认为是死锁了，就中断一个线程
        Thread.sleep(3000);
        /*如果他还是激活状态，那么就中给他中断了*/
        if (thread.isAlive()){
            thread.interrupt();
        }

    }
    /*正常死锁出现的原因*/
    public  static  void t1(int num){
        try {
            if (num % 2 == 0){
                // 如果是偶数
                lock1.lockInterruptibly();
                System.out.println("获取lock1 --- > " + Thread.currentThread().getName());

                Thread.sleep(5000);
                lock2.lockInterruptibly();
                System.out.println("获取lock2 --- > " + Thread.currentThread().getName());

                System.out.println("获取到lock1 和 lock2 ----> " + Thread.currentThread().getName());
            }else {
                lock2.lockInterruptibly();
                System.out.println("获取lock2 --- > " + Thread.currentThread().getName());

                Thread.sleep(2000);
                lock1.lockInterruptibly();
                System.out.println("获取lock1 --- > " + Thread.currentThread().getName());

                System.out.println("获取到lock1 和 lock2 ----> " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()){
                lock1.unlock();
            }
            if (lock2.isHeldByCurrentThread()){
                lock2.unlock();
            }
        }
    }
}
