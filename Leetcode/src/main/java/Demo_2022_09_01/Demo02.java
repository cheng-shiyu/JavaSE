package Demo_2022_09_01;

import java.util.LinkedList;

/**
 * @author 程世玉
 * @data 2022/9/1.
 * 1、题目链接：<a href="https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：栈的压入、弹出序列
 */
public class Demo02 {

    /**
     * description: 栈的压入、弹出序列
     * @author: 程世玉
     * @Date: 2022/9/1
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        LinkedList<Integer> stack = new LinkedList<>();

        int i = 0;
        for (int num : pushed) {
            stack.add(num);
            while (!stack.isEmpty() && stack.getLast() == popped[i]){
                i++;
                stack.removeLast();
            }
        }
        return stack.isEmpty();
    }
}
