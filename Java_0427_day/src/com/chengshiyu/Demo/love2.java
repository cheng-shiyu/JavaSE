package com.chengshiyu.Demo;

/**
 * @author 程世玉
 * @data 2022/4/27.
 * notify唤醒等待的线程
 */
public class love2 {
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        /*开启一个线程，进入锁的状态*/
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "-->开始时间：" + System.currentTimeMillis());

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "-->结束时间： " + System.currentTimeMillis());
            }
        });


        /*再开启一个线程，激活上面的线程*/
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "-->开始时间：" + System.currentTimeMillis());
                lock.notify();
                System.out.println(Thread.currentThread().getName() + "-->结束时间： " + System.currentTimeMillis());
            }
        });

        /*开启线程一*/
        thread.start();

        /*等待1s，让线程一先运行，进入等待状态*/
        Thread.sleep(1000);
        /*开启线程二*/
        thread1.start();


    }
}