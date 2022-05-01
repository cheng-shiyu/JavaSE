package com.Demo01;

public class Cunsumer implements Runnable {
    private goods goods;

    public Cunsumer() {
    }

    public Cunsumer(goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                goods.consume();
                System.out.println("======================================");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
