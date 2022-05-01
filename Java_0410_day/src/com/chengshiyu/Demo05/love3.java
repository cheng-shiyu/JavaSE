package com.chengshiyu.Demo05;

import org.junit.Test;

// sleep
public class love3 {
    @Test
    public void t1(){
        Thread thread = new Thread(() -> {
            System.out.println("123456");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
    }



    // 使用休眠写一个计时器
    @Test
    public void t2() throws InterruptedException {
        int time = 30;
        for (int i = 1; i <= time; i++){
            System.out.println("计时开始："+i);
            Thread.sleep(1000);
        }
    }
}
