package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * 浮点类型怎么定义
 */
public class love3 {
    public static void main(String[] args) {
        /*单精度 4字节、包括符号位1位，所以尾数应该是23位*/
        float a = 0.846f;

        /*仅仅保留了9位小数*/
        float b = 0.1234567891234567891234f;
        System.out.println(b);

        float c = 1234.1234567897f;
        System.out.println(c);

        float d = 123.123456789f;
        System.out.println(d);


        float e = 1234567.1f;
        System.out.println(e);

        float f = 123456789.1465748948948948949848489489f;
        System.out.println(f);
    }
}
