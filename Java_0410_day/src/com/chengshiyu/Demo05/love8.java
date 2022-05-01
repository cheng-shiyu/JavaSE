package com.chengshiyu.Demo05;

public class love8 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("守护线程，守护你我他");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.setDaemon(true);
        thread.start();

        Thread.currentThread().sleep(5000);
        System.out.println("主线程执行完毕");
    }
}
