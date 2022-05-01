package com.chengshiyu.Demo02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 程世玉
 * @create 2022/3/27 9:13
 * @PROJECT_NAME JavaSE
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer age;
    private String name;
}
