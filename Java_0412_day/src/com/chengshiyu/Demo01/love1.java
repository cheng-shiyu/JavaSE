package com.chengshiyu.Demo01;

public class love1 {

    /** 执行次数 */
    //当这个数比较小的时候，是单线程比较快
    private static final long count = 10000000000l;

    public static void main(String[] args) throws InterruptedException {
//        try {
//            concurrent();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        single();


        //并发计算
        concurrency();
        //单线程计算
        serial();
    }
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
                System.out.println(a);
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
//        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("concurrency :" + time + "ms,b=" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b=" + b + ",a=" + a);
    }


//    public static void concurrent() throws InterruptedException {
//        long stater = System.currentTimeMillis();
//
//        /*一边执行加*/
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int a = 0;
//                for (int i = 0; i < 1000000000; i++) {
//                    a += 0;
//                }
//            }
//        });
//        thread.start();
//        /*一边执行减*/
//        int b = 0;
//        for (int i = 0; i < 1000000000; i++){
//            b+=1;
//        }
//        thread.join();
//        long end = System.currentTimeMillis();
//        System.out.println("多线程运行时间 = " + (end - stater));
//    }
//
//
//    public static void single(){
//        long stater = System.currentTimeMillis();
//        int a = 0;
//        for (int i = 0; i < 10000000;i++){
//            a+=5;
//        }
//
//        int b = 0;
//        for (int i = 0; i < 10000000; i++){
//            b+=1;
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("单线程运行时间 = " + (end - stater));
//    }

//    public static void concurrent(){
//        long stater = System.currentTimeMillis();
//
//        /*一边执行加*/
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int a = 0;
//                for (int i = 0; i <1000000000;i++){
//                    a+=0;
//                }
//            }
//        });
//
//        /*一边执行减*/
//        int b = 0;
//        for (int i = 0; i < 1000000000; i++){
//            b+=1;
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("多线程运行时间 = " + (end - stater));
//    }
//
//
//    public static void single(){
//        long stater = System.currentTimeMillis();
//        int a = 0;
//        for (int i = 0; i < 10000000;i++){
//            a+=5;
//        }
//
//        int b = 0;
//        for (int i = 0; i < 10000000; i++){
//            b+=1;
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("单线程运行时间 = " + (end - stater));
//    }
}
