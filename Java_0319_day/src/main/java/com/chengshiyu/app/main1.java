package com.chengshiyu.app;

import com.chengshiyu.lamdbaInterface.*;
import com.chengshiyu.pojo.User;
import org.junit.Test;

/**
 * @author 程世玉
 * @create 2022/3/19 9:10
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class main1 {
    /**
     * lamdba表达式
     * 正常实现一个接口，用匿名内部类的话，就是有下面这几点
     * 1、返回值类型、方法名、参数列表、方法体
     * <p>
     * 我们也是可以使用lamdba替换匿名内部类的，那么，从本质上来讲，lamdba是一个匿名函数
     * 1、参数列表、方法体
     * <p>
     * 语法：（）: 用来描述参数列表
     * {}：用来描述方法体
     * ->: lambda运算符，读作goes to
     */

    /*这俩是lamdbaInterface1中的测试*/
    @Test
    public void t1() {
        lamdbaInterface1 interface1 = new lamdbaInterface1() {
            @Override
            public void t1() {
                System.out.println("我执行啦");
            }
        };
        interface1.t1();
    }

    @Test
    public void t2() {
        lamdbaInterface1 lamdbaInterface1 = () -> {
            System.out.println("lambda表达式");
        };
        lamdbaInterface1.t1();
    }


    /*这俩是lamdbaInterface2中的测试*/
    @Test
    public void t3() {
        lamdbaInterface2 interface2 = new lamdbaInterface2() {
            @Override
            public void t2(String name) {
                System.out.println("匿名内部类 : " + name);
            }
        };
        interface2.t2("程世玉");
    }

    @Test
    public void t4() {
        lamdbaInterface2 interface2 = (String name) -> {
            System.out.println("lambda ： " + name);
        };
        interface2.t2("王文静");
    }


    /*下面俩是lamdbaInterface3中的测试*/
    @Test
    public void t5() {
        lamdbaInterface3 interface3 = new lamdbaInterface3() {
            @Override
            public void t3(String name, int age) {
                System.out.println("你好" + name + "同学，我的年龄是" + age + "岁");
            }
        };
        interface3.t3("程世玉", 20);
    }

    @Test
    public void t6() {
        lamdbaInterface3 interface3 = (String name, int age) -> {
            System.out.println("lambda表达式 ： 你好" + name + "同学，我的年龄是" + age + "岁");
        };
        interface3.t3("王文静", 20);
    }


    /*下面这俩是lamdbaInterface4中的测试*/
    @Test
    public void t7() {
        lamdbaInterface4 interface4 = new lamdbaInterface4() {
            @Override
            public String t4() {
                System.out.println("匿名内部类！！");
                return "返回值是String类型     匿名内部类";
            }
        };
        String regex = interface4.t4();
        System.out.println(regex);
    }

    @Test
    public void t8() {
        lamdbaInterface4 interface4 = () -> {
            return "lamdba表达式  返回值是String类型     匿名内部类";
        };
        String regex = interface4.t4();
        System.out.println(regex);
    }


    /*下面这俩是lamdbaInterface5中的测试*/
    @Test
    public void t9() {
        lamdbaInterface5 interface5 = new lamdbaInterface5() {
            @Override
            public String t5(int age) {
                return "返回值是String类型 ： 年龄是" + age;
            }
        };

        System.out.println(interface5.t5(18));
    }

    @Test
    public void t10() {
        lamdbaInterface5 interface6 = (int age) -> {
            return "lamdba表达式 返回值是String类型 ： 年龄是" + age;
        };
        System.out.println(interface6.t5(546));
    }


    /*下面这俩是lamdbaInterface6中的测试*/
    @Test
    public void t11() {
        lamdbaInterface6 interface6 = new lamdbaInterface6() {
            @Override
            public String t6(int age, String name) {
                return age + "左边 int  右边 String 两个相加极为String" + name;
            }
        };
        System.out.println(interface6.t6(18, "城市与"));
    }

    @Test
    public void t12() {
        lamdbaInterface6 interface6 = (int age, String name) -> {
            return "lambda表达hi是！！！  " + age + "左边 int  右边 String 两个相加极为String" + name;
        };
        System.out.println(interface6.t6(654, "王文南京！！"));
    }


    /*下面这俩是lamdbaInterface7中的测试*/
    @Test
    public void t13() {
        lamdbaInterface7 interface7 = new lamdbaInterface7() {
            @Override
            public User t7(int age, String name) {
                User user = new User();
                user.setAge(age);
                return user;
            }
        };
        System.out.println(interface7.t7(15, "天王盖地虎"));
    }


    @Test
    public void t14() {
        lamdbaInterface7 interface7 = (int age, String name) -> {
            User user = new User();
            user.setAge(age);
            return user;
        };
        System.out.println(interface7.t7(15, "天王盖地虎"));
    }


}

