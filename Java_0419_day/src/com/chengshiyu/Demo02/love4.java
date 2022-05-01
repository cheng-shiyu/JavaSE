package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * 使用常量作为锁对象,如果这个常量并不是一个对象，而是一个数字，或者个Boolean呢？
 * synchronized里面必须是Object，不可以是boolean类型，可以是字符串，因为你字符串也是属于object类型
 */
public class love4 {
    public static void main(String[] args) {
        love4 l1 = new love4();
        love4 l2 = new love4();

        new Thread(() -> {
            l1.t2();
        }).start();

        new Thread(() -> {
            l2.t2();
        }).start();
    }


    public void t2(){
        int num = 100;
        synchronized ("gogoogog") {
            for (int i = 0; i < num; i++) {
                System.out.println(Thread.currentThread().getName() + " = gogogogogo");
            }
        }
    }

}
