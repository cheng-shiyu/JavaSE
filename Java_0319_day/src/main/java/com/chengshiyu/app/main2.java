package com.chengshiyu.app;

import com.chengshiyu.lamdbaInterface.lamdbaInterface1;
import com.chengshiyu.lamdbaInterface.lamdbaInterface6;
import com.chengshiyu.lamdbaInterface.lamdbaInterface7;
import com.chengshiyu.lamdbaInterface.lamdbaInterface8;
import com.chengshiyu.pojo.User;
import org.junit.Test;

/**
 * @author 程世玉
 * @create 2022/3/19 10:00
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class main2 {
    @Test
    public void t1() {
        lamdbaInterface1 interface1 = () -> {
            System.out.println("123456");
        };
        interface1.t1();
    }


    @Test
    public void t2() {

//        lamdbaInterface7 interface2 = (10)-> new User(10);

        lamdbaInterface6 interface6 = (a, b) -> "城市与";
        System.out.println(interface6.t6(12, "城市与dsaf"));

        lamdbaInterface7 interface2 = (a , b)-> new User();
        System.out.println(interface2.t7(1, "jaj"));
    }


    @Test
    public void t3() {

        lamdbaInterface8 interface8 = (a,b)-> a + b ;

        System.out.println(interface8.t8(10, 12));

    }

    @Test
    public void t4() {

        /**
         *  Interger t8(int age, String name);
         *
         *  这个接口，要求我们要有俩参数，返回值要是Integer类型，其余的他什么都不管，只要你满足我的条件即可
         *
         *
         *  那么，
         */
        lamdbaInterface8 interface10 = new lamdbaInterface8() {
            @Override
            public Integer t8(int a, int b) {
                return a + b;
            };
        };

        lamdbaInterface8 interface11 = (a,b)->{
            return a+b;
        };


        lamdbaInterface8 interface12 = (a,b)->a+b;

        lamdbaInterface8 interface13 = new lamdbaInterface8() {
            /*参数不可以少*/
            @Override
            public Integer t8(int a, int b) {
                return a;
            };
        };


        lamdbaInterface8 interface14 = (a,b)->{
            return a;
        };

        lamdbaInterface8 interface15 = (a,b)->a;


        lamdbaInterface8 interface8 = main2::sum;


        lamdbaInterface8 interface9 = (a,b) -> sum1(a);


        /*上面不报错，下面报错，原因很简单，
        可以看一下interface15对象，返回就一个a，
        说明只要是Integer类型即可
        所以上面调用方法，哪怕就一个参数，那也是可以的，
        原理和interface15一样，你只要返回给我一个Integer类型就行


        但是下面就不同的，你没法传递俩参数，肯定就不满足我们接口的需求，所以下面的报错
        */
//        lamdbaInterface8 interface16 = main2 :: sum1;



    }

    public static Integer sum(Integer a, Integer b) {
        return (a + b) / 10;
    }
    public static Integer sum1(Integer a) {

        return (a ) / 10;
    }

}
