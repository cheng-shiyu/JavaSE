package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * synchronized 锁住同一个对象
 * 同步代码块，this锁对象
 */
public class love1 {
    public static void main(String[] args) {
        love1 l = new love1();
        new Thread(() -> {
           l.t1();
        }).start();

        new Thread(()->{
            l.t1();
        }).start();

    }

    public void t1(){
        int num = 100;
        synchronized (this) {
            for (int i = 0; i < num; i++) {
                System.out.println(Thread.currentThread().getName() + " = " + i);
            }
        }
    }
}
