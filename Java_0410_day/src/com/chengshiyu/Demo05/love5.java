package com.chengshiyu.Demo05;

// 让当前线程放弃资源
public class love5 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        int a = 0;

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                int b = 0;
                for (int i = 0; i < 100000; i++) {
                    b+=i;
//                    Thread.yield();
                }
                long end = System.currentTimeMillis();
                System.out.println("线程1：一共执行了 " + (end - currentTimeMillis));
            }
        });
            thread.start();
        for (int i = 0; i < 100000; i++) {
            a+=i;
        }
        long end = System.currentTimeMillis();

        System.out.println("main方法：一共执行了 " + (end - currentTimeMillis));

    }
}
