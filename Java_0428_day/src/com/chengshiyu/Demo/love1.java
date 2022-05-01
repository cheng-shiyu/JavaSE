package com.chengshiyu.Demo;

/**
 * @author 程世玉
 * @data 2022/4/28.
 */
public class love1 {
    static  String lock = "程世玉";

    public static void main(String[] args) {
        /*设置一个守护线程*/
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                if (lock.equals("王文静")) {
                    System.out.println("守护线程开始工作");
                    lock = "程世玉";
                    Thread.currentThread().notifyAll();
                }
            }

        });
        thread.setDaemon(true);

        thread.start();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 500; i++) {
                    if (i == 149) {
                        System.out.println(Thread.currentThread().getName() + "设置为王文静");
                        lock = "王文静";
                        try {
                            i = 0;
                            Thread.currentThread().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}
