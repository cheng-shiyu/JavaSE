package com.chengshiyu.Demmo01;

import com.chengshiyu.Utils.User;
import com.chengshiyu.Utils.loveUtils;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @Description: 流的中间操作
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/3/31 22:59
 * 1、遍历逐一处理（forEach）
 * 2、过滤处理（filter）
 * 3、映射（map）
 * 4、统计流中元素的个数（count
 * 5、截取特定数量的前几个流元素（limit）
 * 6、跳过前几个，获取之后的流（skip）
 * 7、组合流（concat）
 * 8、排序（sorted）
 * 9、去重（distinct）
 */
// 3、映射（map）
public class love6 {
    @Test
    public void t1() {
        String[] arr = new String[]{"12", "33", "44"};
        /*内置接口function ，这个接口是这样的   Function<T, R>  T 是参数类型，R是返回值类型，这个我们在写自定义参数解析器的时候用过！！*/
        /*方式一，原始一点的方式*/
//    Stream<Integer> stream = Arrays.stream(arr).map(new Function<String, Integer>() {
//      @Override
//      public Integer apply(String s) {
//        int a = 0;
//        if (s.matches("\\d+")) {
//          a = Integer.parseInt(s);
//        }
//        return a;
//      }
//    });


        /*这个调用的还是apply方法！！！*/
        Stream<Integer> stream = Stream.of(arr).map((s) -> {
            if (s.matches("\\d+")) {
                return Integer.parseInt(s);
            }
            return null;
        });
        stream.forEach(System.out::println);
    }

    @Test
    public void t2() {
        ArrayList<User> arrayUser =
                loveUtils.getArrayUser();

//    Optional<User> any = arrayUser.stream().findAny();
//    System.out.println(any);

        arrayUser.stream().filter(e -> e.getAge() > 5000).forEach(System.out::println);
    }


    // 需求，快速的将数组里面的字符串中是数字的放入我们map中
    @Test
    public void t3() {
        String[] arr = new String[]{"12", "33", "44"};
        /*内置接口function ，这个接口是这样的   Function<T, R>  T 是参数类型，R是返回值类型，这个我们在写自定义参数解析器的时候用过！！*/

        HashMap<String, Integer> map = new HashMap<>();

//    Stream<HashMap<String,Integer>> stream = (Stream<HashMap<String, Integer>>) Arrays.stream(arr).map(s -> {
//      if (s.matches("\\d+")) {
//        return map.put("key" + s, Integer.parseInt(s));
//      }
//      return new HashMap<String,Integer>();
//    });

        ArrayList<Integer> list = new ArrayList<>();
        Stream<Serializable> stream = Arrays.stream(arr).map(s -> {
            if (s.matches("\\d+")) {
                Integer integer = Integer.parseInt(s);
                list.add(integer);
            }
            return list;
        });

        stream.forEach(System.out::println);
        System.out.println("===============");
        list.forEach(System.out::println);
    }


}
