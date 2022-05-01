package com.Demo01;

public class Producer implements Runnable {
    private goods goods;

    public Producer(){}

    public Producer(goods goods){
        this.goods = goods;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                goods.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
