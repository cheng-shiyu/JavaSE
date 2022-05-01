package com.chengshiyu.Demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 线程交错打印
 */
public class love3 {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();
    private static boolean flag = true;
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 100; i++){
                t1();
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 100; i++){
                t2();
            }
        }).start();
    }
    public static void printTo(){
        System.out.println(Thread.currentThread().getName() + "------> 执行");
    }

    public static void t1(){
        try {
            lock.lock();
            if (flag){
                condition1.await();
            }
            printTo();
            flag = !flag;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public static void t2(){
        try {
            lock.lock();
            if (!flag){
                condition1.await();
            }
            printTo();
            flag = !flag;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


