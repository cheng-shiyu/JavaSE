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
public class main3 {

    /**
     * 构造方法作用： 创建对象的时候使用
     * 既然方法能够引用，那么我构造方法也是方法也，构造方法就是为了创建对象而生的
     * 我就不仅仅可以通过lambda进行属性的赋值，也可以通过这个进行简单化的创建对象了
     *
     */

    interface lamdbaInterface9{
        User t9();
    }

    @Test
    public void t1() {
        lamdbaInterface9 interface9 = new lamdbaInterface9() {
            @Override
            public User t9() {
                return new User();
            }
        };


        lamdbaInterface9 interface91 = ()->{
            return new User();
        };

        lamdbaInterface9 interface92 = () -> new User();


        lamdbaInterface9 interface93 = User::new;
    }

}
