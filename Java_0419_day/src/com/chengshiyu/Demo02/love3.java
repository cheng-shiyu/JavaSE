package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * 使用常量作为锁对象
 */
public class love3 {
    public static void main(String[] args) {
        love3 l1 = new love3();
        love3 l2 = new love3();

        new Thread(()->{
            l1.t1();
        }).start();

        new Thread(()->{
            l2.t1();
        }).start();
    }

    public final static Object OBJ = new Object();
    public void t1(){
        int num = 100;
        synchronized (OBJ) {
            for (int i = 0; i < num; i++) {
                System.out.println(Thread.currentThread().getName() + " = " + i);
            }
        }
    }
}
