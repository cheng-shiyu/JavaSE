package com.chengshiyu.Demo01;

import java.util.function.Consumer;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * Consumer消费者
 */
public class love4 {
    /*
    练习:
        字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
        要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
        将打印性别的动作作为第二个Consumer接口的Lambda实例，
        将两个Consumer接口按照顺序“拼接”到一起。
     */
    public static void main(String[] args) {
        String[] arr = new String[]{"程世玉，男，22", "豪猪，畜生，2", "张三，女，18"};
        t(arr,
                t -> {
                    String[] split = t.split("，");
                    System.out.print("姓名：" + split[0]);
                },
                t -> {
                    String[] split = t.split("，");
                    System.out.print(",性别：" + split[1]);
                    System.out.println(",年龄：" + split[2]);
                });
    }

    public static void t(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        /*循环遍历*/
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

}
