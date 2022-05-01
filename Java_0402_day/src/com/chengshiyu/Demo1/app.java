package com.chengshiyu.Demo1;

public class app {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        t1 m = new t1();
        t2 n = new t2();
//
        m.start();
        n.start();

//        for (int i = 0; i < 10000 * 2; i++) {
////            System.out.println("运行了" + tank.sum++ + "次");
//            tank.sum+=1;
//            System.out.println("特朗普添加完后有" +  tank.sum + "桶水");
//        }
        long end = System.currentTimeMillis();
        System.out.println("一共运行了" + (end - start));

    }
}
