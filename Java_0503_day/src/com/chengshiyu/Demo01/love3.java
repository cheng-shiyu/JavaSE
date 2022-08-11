package com.chengshiyu.Demo01;

import java.util.function.Consumer;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * 消费者接口 consumer<T>
 * Consumer接口的默认方法andThen
 * 作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费
 * 例如:
 * Consumer<String> con1
 * Consumer<String> con2
 * String s = "hello";
 * con1.accept(s);
 * con2.accept(s);
 * 连接两个Consumer接口  再进行消费
 * con1.andThen(con2).accept(s); 谁写前边谁先消费
 */
public class love3 {
    public static void main(String[] args) {
        t1("程世玉，很高兴见到你！！！",
                (t) -> {
                    // 消费方式，把所有的，去除掉
                    String replace = t.replace("，", "");
                    System.out.println("消费者一消费：" + replace);
                },
                (t) -> {
                    String replace = t.replace("！", "*!*");
                    System.out.println("消费者二消费：" + replace);
                });



    }


    public static void t1(String name, Consumer<String> consumer1, Consumer<String> consumer2) {
        //con1.accept(s);
        //con2.accept(s);
        //使用andThen方法,把两个Consumer接口连接到一起,在消费数据
        //con1连接con2,先执行con1消费数据,在执行con2消费数据
        consumer1.andThen(consumer2).accept(name);
    }
}
