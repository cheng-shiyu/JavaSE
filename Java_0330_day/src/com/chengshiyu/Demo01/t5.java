package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 14:18
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class t5 {
    /*枚举类型，一般在处理异常的*/
    public static final int MONDAY =1;

    public static final int TUESDAY=2;

    public static final int WEDNESDAY=3;

    public static final int THURSDAY=4;

    public static final int FRIDAY=5;

    public static final int SATURDAY=6;

    public static final int SUNDAY=7;

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public static void print(){
            System.out.println("你好呀");
        }

        private String name = "程世玉";

    }


    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        Day.print();
    }
}
