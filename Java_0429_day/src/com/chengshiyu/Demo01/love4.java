package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @data 2022/4/29.
 * synchronized 不足之处之一个线程进入阻塞模式，其余线程都要等待
 */
public class love4 {
    private static  final  String lock = "锁对象";
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            t1();
        });
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("线程二开始睡眠，其余线程陷入等待");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1();
        });
        Thread thread3 = new Thread(() -> {
            t1();
        });
        Thread thread4 = new Thread(() -> {
            t1();
        });
        Thread thread5 = new Thread(() -> {
            t1();
        });
        thread1.start();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(1000);
        thread3.start();
        Thread.sleep(1000);
        thread4.start();
        Thread.sleep(1000);
        thread5.start();

    }

    public static void t1(){
        synchronized (lock){
            System.out.println(Thread.currentThread().getName() + "----> 正在执行！！！！");
        }
    }
}
