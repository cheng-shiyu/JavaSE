package Demo_2022_04_22;

import Demo_2022_04_22.pojo.ListNode;

/**
 * @author 程世玉
 * @data 2022/4/22.
 * 反转链表
 * 题目地址：https://leetcode-cn.com/problems/reverse-linked-list/
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class Demo02 {

    /*递归法*/
    public ListNode reverseList(ListNode head) {
        if (head.next==null || head == null){
            return head;
        }
        ListNode newNode = reverseList(head.next);
        // head.next = 4
        // head.next.next 指向原本的头节点，因为已经开始反转了，本来5 --- 4
        // 现在是4 --- 5 所以head.next.next = head
        // 同时，head.next已经要是最后的节点了，那么就要指向null
        head.next.next = head;
        head.next = null;
        return newNode;
    }


    /*非递归*/
    public ListNode reverseList1(ListNode oldhead){
        if (oldhead == null || oldhead.next == null){
            return oldhead;
        }
        ListNode tmp = null;
        ListNode head = null;
        while (oldhead != null) {
            /*下一节点*/
            tmp = oldhead.next;

            oldhead.next = head;

            head = oldhead;

            oldhead = tmp;

        }
        return head;
    }
}
