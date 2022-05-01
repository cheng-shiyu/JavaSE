package com.chengshiyu.Demo04;

public class love1 {
    public static void main(String[] args) {
        /*明白一件事，下面这两种方式是一样的，本质都是重写Thread类中的run方法
        * 只不过下面那种方式，run方法我们是在主线程中写的，采用的是匿名内部类的方式*/
        new Thread(new t1());
        new Thread(() -> {});


        // 接口，不就是规范吗，他会不会就是规范一种东西呢？

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };


        Thread thread = new Thread(runnable);
    }
}
