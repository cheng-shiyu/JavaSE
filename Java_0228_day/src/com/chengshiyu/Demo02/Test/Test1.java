package com.chengshiyu.Demo02.Test;

import com.chengshiyu.Demo02.Father;
import com.chengshiyu.Demo02.son1;

/**
 * @author 程世玉
 * @create 2022/2/28 9:03
 * @PROJECT_NAME JavaSE
 * @Description
 * 1、静态方法，没有办法重写，只能重载
 * 2、如果向上转型，调用的则是父类的static方法
 * 3、探究一下，普通方法为什么调用的就是子类的方法，而static就是调用父类的
 * 4、构造器，向上转型的时候，构造器到底是怎么执行的
 */
public class Test1 {
    public static void main(String[] args) {
        son1 son = new son1();
        son.Read("chengshiyu","123456");
        System.out.println("===================================================");

        Father son11 = new son1();
        son11.Read("wangwenjing","123456");
        son11.eat();
        System.out.println("===================================================");


//        Father father = new Father();
//        System.out.println(Father.aaa);
//        System.out.println(father.aaa);

    }
}
