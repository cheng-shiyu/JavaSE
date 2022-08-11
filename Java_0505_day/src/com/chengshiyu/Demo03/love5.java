package com.chengshiyu.Demo03;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * 线程异常处理
 */
public class love5 {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t,e)->{
            System.out.println(t.getName() + "出现异常，原因：" + e.getMessage());
        });

        new Thread(()->{
            System.out.println("线程开始执行！！");
            /*休眠1s*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("下面该抛出异常了");
            System.out.println(10 / 0);
        }).start();
    }
}
