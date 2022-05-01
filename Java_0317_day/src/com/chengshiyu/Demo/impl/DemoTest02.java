package com.chengshiyu.Demo.impl;

import com.chengshiyu.Demo.DemoInterface;

/**
 * @author 程世玉
 * @create 2022/3/18 22:23
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class DemoTest02 implements DemoInterface<Integer> {
    @Override
    public void t1(Integer integer) {
        System.out.println(integer);
    }
}
