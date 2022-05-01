package com.chengshiyu.Demmo01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
// 1、遍历逐一处理（forEach）
public class love4 {
  @Test
  public void t1(){
    String[] arr=new String[]{"苹果","香蕉","草莓"};
    Stream.of(arr).forEach(System.out::println);
    Arrays.stream(arr).forEach(System.out::println);
  }

  @Test
  public void t2(){
    ArrayList<String> list = new ArrayList<>();

    list.stream().forEach((s)-> System.out.println(s));
  }



}
