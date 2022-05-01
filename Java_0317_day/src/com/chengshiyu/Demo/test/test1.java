package com.chengshiyu.Demo.test;

import com.chengshiyu.Demo.impl.AAAAA1;
import com.chengshiyu.Demo.impl.DemoTest01;
import com.chengshiyu.Demo.impl.DemoTest02;
import com.chengshiyu.lamdba;
import org.junit.Test;

/**
 * @author 程世玉
 * @create 2022/3/18 22:20
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class test1 {
    @Test
    public void t1() {
        DemoTest01 demoTest01 = new DemoTest01();
        demoTest01.t1("程世玉");
    }

    @Test
    public void t2() {
        DemoTest02 demoTest02 = new DemoTest02();
        demoTest02.t1(156);
    }


    @Test
    public void t3() {
        AAAAA1<Integer> aaaaa1 = new AAAAA1<>();
        aaaaa1.bbb(1);
    }

    @Test
    public void t4() {
        AAAAA1<Integer> aaaaa1 = new AAAAA1<>();
        aaaaa1.ccc(1);
    }


    @Test
    public void t5() {
        AAAAA1<lamdba> aaaaa1 = new AAAAA1<>();
        lamdba lamdba = new lamdba();


        aaaaa1.ccc(lamdba);
    }


    /**
     * 需求
     * 将数字转换为汉字，并且调用不同对象的方法
     */
}
