package com.chengshiyu.Demo03;

/**
 * @author 程世玉
 * @data 2022/4/30.
 */
public class app {
    public static void main(String[] args) {
        Storge storge = new Storge();
        Thread customer1 = new Thread(()->{
            while (true){
                storge.customer();
            }
        });
        Thread customer2 = new Thread(()->{
            while (true){
                storge.customer();
            }
        });
        Thread customer3 = new Thread(()->{
            while (true){
                storge.customer();
            }
        });

        Thread provider1 = new Thread(()->{
            while (true){
                storge.provider();
            }
        });
        Thread provider2 = new Thread(()->{
            while (true){
                storge.provider();
            }
        });

        customer1.start();
        customer2.start();
        customer3.start();
        provider1.start();
        provider2.start();
    }
}
