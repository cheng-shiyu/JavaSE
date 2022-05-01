package com.chengshiyu.Demo05;


// 中断实验
public class love6 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名字："+Thread.currentThread().getName());

                for (int i = 1; i < 100000000; i++) {
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("线程被中断，我要退出了");
                        return;
                    }
                    System.out.println("线程一：执行了" + i + "次");
                }
            }
        });

        thread.start();
        for (int i = 1; i < 100; i++) {
            System.out.println("main：执行了" + i + "次");
        }

        // 当我的主线程执行完成，然后让我的子线程停止,此刻主线程执行到这里就应该执行完毕的！！
        thread.interrupt();
    }
}
