package com.chengshiyu.Demo05;

// 判断当前线程状态
public class love4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("你好，世界");
            }
        };

        Thread thread = new Thread(runnable);

        System.out.println("1:"+thread.isAlive());
        thread.start();
        /*判断是否是激活状态*/
        System.out.println("2:"+thread.isAlive());
        /*判断是否是中断状态*/
        System.out.println("3:"+thread.isInterrupted());
        /*判断是否是守护线程*/
        System.out.println("4:"+thread.isDaemon());
    }
}
