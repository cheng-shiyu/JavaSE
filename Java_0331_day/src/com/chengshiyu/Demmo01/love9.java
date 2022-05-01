package com.chengshiyu.Demmo01;

import com.chengshiyu.Utils.User;
import com.chengshiyu.Utils.loveUtils;
import org.junit.Test;

import java.util.ArrayList;
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
// 7、组合流（concat）
public class love9 {
    @Test
    public void t1() {
        String[] arr=new String[]{"12","33","44"};
        String[] arr2=new String[]{"苹果","香蕉","草莓"};
        ArrayList<User> arrayUser = loveUtils.getArrayUser();

        Stream<String> stream1= Stream.of(arr);
        Stream<String> stream2 = Stream.of(arr2);
        Stream<User> stream3 = arrayUser.stream();

        Stream<Object> stream = Stream.concat(stream1, stream3);



//        Stream<String> concat = Stream.concat(stream1, stream2);
    }

    @Test
    public void t2() {
        ArrayList<User> arrayUser =
                loveUtils.getArrayUser();

        long count = arrayUser.stream().count();
        System.out.println(count);
    }


    @Test
    public void t3() {

    }


}
