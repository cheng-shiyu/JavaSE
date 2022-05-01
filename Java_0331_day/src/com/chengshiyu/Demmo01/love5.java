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
// 2、过滤处理（filter）
public class love5 {
  @Test
  public void t1(){
    String[] arr=new String[]{"苹果","香蕉","草莓"};
//    /*第一种方式*/
//    Stream<String> stream = Arrays.stream(arr).filter(new Predicate<String>() {
//      @Override
//      public boolean test(String s) {
//        if (s.startsWith("苹")) {
//          return true;
//        }
//        return false;
//      }
//    });
//    /*第二中方式*/
//    Stream<String> stream = Stream.of(arr).filter((s) -> {
//      if (s.startsWith("苹")) {
//        System.out.println(s);
//      }
//      return false;
//    });

    /*第三种方式*/
    Stream<String> stream = Stream.of(arr).filter(s -> s.startsWith("苹"));


    stream.forEach(System.out::println);


  }

  @Test
  public void t2(){
    ArrayList<User> arrayUser =
            loveUtils.getArrayUser();

//    Optional<User> any = arrayUser.stream().findAny();
//    System.out.println(any);

    arrayUser.stream().filter(e->e.getAge() > 5000).forEach(System.out::println);
  }



}
