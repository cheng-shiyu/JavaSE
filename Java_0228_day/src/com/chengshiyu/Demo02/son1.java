package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @create 2022/2/28 9:00
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class son1 extends Father{

    public son1() {
        System.out.println("son1 无参构造");
    }

    public static void Read(String username, String password){
        System.out.println(username);
        System.out.println(password);
        System.out.println("son中的静态方法");
    }

    @Override
    public void eat() {
        System.out.println("子类方法 eat");
    }
}
