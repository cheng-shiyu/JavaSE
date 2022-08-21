package Demo_2022_08_17;

import java.util.Stack;

/**
 * @author 程世玉
 * @data 2022/8/17.
 * 1、题目链接：<a href="https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">...</a>
 * 2、题目描述：输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Demo03 {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int len = 0;
        while (head != null){
            stack.add(head.val);
            head = head.next;
            len++;
        }
        int[] ints = new int[len];

        for (int i = 0; i < len; i++){
            ints[i] = stack.pop();
        }
        return ints;
    }
}
