package com.chengshiyu.Demo.impl;

import com.chengshiyu.Demo.DemoInterface;

/**
 * @author 程世玉
 * @create 2022/3/18 22:20
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class DemoTest01 implements DemoInterface {
    public void t1(Object[] o) {
        for (Object o1 : o) {
            System.out.println(o1);
        }
    }

    @Override
    public void t1(Object o) {

    }
}
