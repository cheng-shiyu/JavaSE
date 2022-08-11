package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @data 2022/5/12.
 * Request请求类
 */

public class Request {
    public void send(CallBack callBack,String message) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "开始执行具体业务代码");
        Thread.sleep(4000); // 模拟处理业务时间
        System.out.println(Thread.currentThread().getName() + "结束执行具体业务代码");
        callBack.callBack(message);
        System.out.println(Thread.currentThread().getName() + "模拟回调函数结束！！");
    }
}
