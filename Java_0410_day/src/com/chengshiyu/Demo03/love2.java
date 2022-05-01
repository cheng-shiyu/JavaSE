package com.chengshiyu.Demo03;

public class love2 {
    public static void main(String[] args) throws InterruptedException {
        t1 x1 = new t1();
        x1.setName("线程一");
        x1.start();

//        Thread.sleep(5000);

        Thread x2 = new Thread(x1);
        x2.start();

    }
}
