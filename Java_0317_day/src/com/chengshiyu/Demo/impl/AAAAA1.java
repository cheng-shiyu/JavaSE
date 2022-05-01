package com.chengshiyu.Demo.impl;

import com.chengshiyu.Demo.pojo.User;
import com.chengshiyu.lamdba;

/**
 * @author 程世玉
 * @create 2022/3/18 22:24
 * @PROJECT_NAME JavaSE
 * @Description
 */
/*泛型类*/
public class AAAAA1<T> {
    /*泛型参数*/
    public void aaa(T t){
        System.out.println(t);
    }

    /*泛型方法*/
    public T bbb(T t){
        System.out.println(t);
        System.out.println(t.getClass());
        return t;
    }


    /*实现的就是你传递进来的参数，必须直接实现或者继承改接口*/
    public <T extends Comparable<Integer>> T ccc(T t){
        System.out.println(t);
        return t;
    }


    public <T> User<T> ddd(T t){
        /**/
        return new User<>();
    }
}
