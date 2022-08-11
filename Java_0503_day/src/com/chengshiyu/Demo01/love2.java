package com.chengshiyu.Demo01;

import java.util.function.Consumer;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * 消费者接口 consumer<T>
 */
public class love2 {
    public static void main(String[] args) {
        t1("程世玉",(name)->{
            // 对传递的字符串进行消费
            // 消费的方式是字符反转，进行输出
            String s = new StringBuffer(name).reverse().toString();
            System.out.println(s);
        });
    }


    public static void t1(String name,Consumer<String> consumer){
        consumer.accept(name);
    }
}
