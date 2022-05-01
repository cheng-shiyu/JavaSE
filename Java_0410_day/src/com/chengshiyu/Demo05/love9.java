package com.chengshiyu.Demo05;

public class love9 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("等待线程：执行了" + i + "次");
                /*如果当前执行够了50次，就进行等待状态*/
                if (i > 50){
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
}
