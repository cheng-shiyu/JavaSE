package com.chengshiyu.Demmo01;

public class love12 {
    public static void main(String[] args) {
//        Integer l = 0;
        int l = 0;
        long currentTimeMillis = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++){
            l += 1;
        }

        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis - currentTimeMillis);
    }
}
