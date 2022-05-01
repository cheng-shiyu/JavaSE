package com.chengshiyu.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 程世玉
 * @create 2022/3/19 16:19
 * @PROJECT_NAME JavaSE
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class t1 implements Comparable<t1>{
    private Integer age;
    @Override
    public int compareTo(t1 o) {
        /*小于则返回负数，等于则返回0 大于则返回正数*/
        return this.age - o.age;
    }
}
