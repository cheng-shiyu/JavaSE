package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @create 2022/2/28 8:59
 * @PROJECT_NAME JavaSE
 * @Description
 */

public  class Father {
    public String username;
    public String password;
    public static int aaa = 10;

    public Father(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("father有参构造器");
    }

    public Father() {
        System.out.println("无参构造 father");
    }

    public static void Read(String username, String password){
        System.out.println(username);
        System.out.println(password);
        System.out.println("Father静态方法");
    }

    public void eat() {
        System.out.println("父类方法 eat");
    }
}
