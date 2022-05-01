package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 20:44
 * @PROJECT_NAME JavaSE
 * @Description i++ i--的区别
 */
public class t8 {
    public static void main(String[] args) {
        int i = 1;

        // i++ 了，但是这里输出仍然是1
        System.out.println(i++); // 1
        System.out.println(i);  // 2

        // ++i ，这个是需要先+后用，所以这里输出3
        System.out.println(++i); // 3
    }
}
