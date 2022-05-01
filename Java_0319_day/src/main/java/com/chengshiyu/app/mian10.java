package com.chengshiyu.app;

import java.util.function.Consumer;

/**
 * @author 程世玉
 * @create 2022/3/19 17:36
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class mian10 {
    public static void main(String[] args) {
        int a = 10;
//        Consumer<Integer> c = System.out::println;

        /*闭包，这个时候可以引用外面的参数*/
        Consumer<Integer> c = (e)->{
            /*闭包，这个时候可以引用外面的参数*/
            /*通过这种方式能够更加清晰看到结果，假如我们传入的a，那到底是a传进去的还是他这里面本来就可以直接引入外界的a，通过这种方式能够很清楚的看到*/
            System.out.println(a);
        };
        c.accept(a);
    }
}
