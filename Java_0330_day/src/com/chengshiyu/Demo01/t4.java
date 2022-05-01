package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 14:10
 * @PROJECT_NAME JavaSE
 * @Description
 *  9 * 9 乘法口诀
 */

public class t4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
           for (int j = 1; j <= 9; j++){
               System.out.print(i + " * " + j + " = " + i * j + "\t");
           }
            System.out.println();
        }
    }
}
