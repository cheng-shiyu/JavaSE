package com.chengshiyu.Demo04;

public class t1 {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("lies".hashCode() % 16);
        System.out.println("foes".hashCode() % 16);

    }
}
