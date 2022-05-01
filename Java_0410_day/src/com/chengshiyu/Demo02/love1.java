package com.chengshiyu.Demo02;

public class love1 {
    public static void main(String[] args) throws Exception {

        // 这个放到前面，下面几个如果能够正常执行，说明是多线程，主要看我直接重写的runable接口是否是多线程
        // 结论1，下面这种不行，这种就没有开多线程，说明还是main这个主线程，他直接给主线程给阻断了，就没有执行下面多线程的任务，多线程就没有开启，那么就不存则下面线程执行的问题
        // 结论2，这种方式直接重写接口的方式是不行的，没啥用，没有start方法开启他没用！！
//        Callable<String> stringCallable = new Callable<>() {
//            @Override
//            public String call() throws Exception {
//                Thread.sleep(10000);
//                return t1();
//            }
//        };
//        stringCallable.call();
        // 这个放到前面，下面几个如果能够正常执行，说明是多线程，主要看我直接重写的runable接口是否是多线程
        // 结论1，下面这种不行，这种就没有开多线程，说明还是main这个主线程，他直接给主线程给阻断了，就没有执行下面多线程的任务，多线程就没有开启，那么就不存则下面线程执行的问题
        // 结论2，这种方式直接重写接口的方式是不行的，没啥用，没有start方法开启他没用！！
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我执行啦！！！，run中的方法");
            }
        };
        runnable.run();



        /*一种使用lambda表达式*/
        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("11111");

        }).start();
        /*一种是专门用一个实现类*/
        new Thread(new t1()).start();

        /*一种是给线程命名*/
        new Thread(() -> System.out.println("123456"), "线程1").start();


    }
}
