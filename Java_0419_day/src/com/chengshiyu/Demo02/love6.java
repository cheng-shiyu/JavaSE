package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * 同步静态方法：又称之为类锁
 * 默认的锁对象是当前类对象
 */
public class love6 {
    public static void main(String[] args) {
        love5 l = new love5();
        /*调用静态方法*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                love6.t1();
            }
        }).start();

        /*调用普通方法，但是锁的对象是类，此刻看一下*/
        new Thread(l::t2).start();
    }

    public synchronized static void t1() {
        int num = 100;
        for (int i = 0; i < num; i++) {
            System.out.println(Thread.currentThread().getName() + " = gogogogogo");
        }
    }

    public void t2() {
        int num = 100;
        synchronized (love6.class) {
            for (int i = 0; i < num; i++) {
                System.out.println(Thread.currentThread().getName() + " = gogogogogo");
            }
        }
    }

}
