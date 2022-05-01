package com.chengshiyu.app;

/**
 * @author 程世玉
 * @create 2022/3/19 17:36
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class mian8 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++){
                System.out.print(i);
            }
        });

        thread.start();
    }
}
