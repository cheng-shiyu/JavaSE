package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * hook 钩子函数应用
 * 实验失败，只有程序结束的时候，才能调用钩子函数
 */
public class love2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("线程开始运行啦，线程执行了一段时间");
            ThreadUtils.sleepTime(10);
        });

    }


}
