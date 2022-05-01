package com.chengshiyu.Pojo1;

/**
 * @author 程世玉
 * @create 2022/3/3 10:12
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class Method {
    public static <T> void method1(Father[] father){
        for (Father father1 : father) {
            System.out.println(father1);
        }
    }
}
