package com.chengshiyu.comparable.test;

import com.chengshiyu.comparable.t1;
import org.junit.Test;

/**
 * @author 程世玉
 * @create 2022/3/19 16:29
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class Demo01 {
    @Test
    public void test(){
        t1 a = new t1(18);
        t1 b = new t1(17);

        /*比较量对象的年龄*/
        int i = a.compareTo(b);
        System.out.println(i);

    }
}
