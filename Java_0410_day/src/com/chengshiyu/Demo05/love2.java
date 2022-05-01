package com.chengshiyu.Demo05;

// getId,getName,setName
public class love2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("执行方法！！！");
        });

        String name = thread.getName();
        thread.setName("多线程");
        String name1 = thread.getName();
        System.out.println(name);
        System.out.println(name1);

        System.out.println(thread.getId());
    }
}
