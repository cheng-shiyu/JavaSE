package Demo_2022_08_10;


/**
 * @author 程世玉
 * @data 2022/8/10.
 * 1、题目链接：<a href="https://leetcode.cn/problems/UHnkqh/">...</a>
 * 2、题目描述：给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点
 */
public class Demo01 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        // 此刻是最后一个节点
        if (head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return node;
    }
}
