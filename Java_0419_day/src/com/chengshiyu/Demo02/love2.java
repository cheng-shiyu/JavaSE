package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * 锁对象不同不能实现锁的效果
 */
public class love2 {
    public static void main(String[] args) {
        love2 l1 = new love2();
        love2 l2 = new love2();

        new Thread(()->{
            l1.t1();
        }).start();

        new Thread(()->{
            l2.t1();
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
