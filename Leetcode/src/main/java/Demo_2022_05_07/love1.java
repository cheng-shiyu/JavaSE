package Demo_2022_05_07;

import Demo_2022_04_22.pojo.ListNode;

/**
 * @author 程世玉
 * @data 2022/5/7.
 * 题目链接：https://leetcode-cn.com/problems/add-two-numbers/
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头
 */
public class love1 {


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; // 进位
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;

            carry = sum / 10;  // 进位
            sum = sum % 10;  // 相当于当前还留下来的数字
            /**
             * 下面两步有点迷 ，cur代表当前的节点，因为我们每次都要让当前节点的下一个节点等于新的数
             * 但是我们怎么得到当前节点呢，不可能head.next.next.next循环吧，用递归可以解决，但是不好
             * 所以，引入第三方指针的概念，让cur代表当前节点，就是每次添加后链表最后的一个节点
             */
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1.next != null) {
                l1 = l1.next;
            }
            if (l2.next != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1){
            cur.next = new ListNode(carry);
        }

        return listNode.next;
    }
}
