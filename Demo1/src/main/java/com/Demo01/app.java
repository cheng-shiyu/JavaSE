package com.Demo01;

public class app {
    public static void main(String[] args) {
        goods goods = new goods();
        Thread p1 = new Thread(new Producer(goods));
        Thread c1 = new Thread(new Cunsumer(goods));

        p1.start();
        c1.start();
    }



}
