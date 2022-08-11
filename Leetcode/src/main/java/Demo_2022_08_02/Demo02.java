package Demo_2022_08_02;

/**
 * @author 程世玉
 * @data 2022/8/2.
 * 题目连接：<a href="https://leetcode.cn/problems/palindrome-linked-list/">...</a>
 * 输入：head = [1,2,2,1]
 * 输出：true
 */
public class Demo02 {
    static class ListNode {
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

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        head.next = new ListNode(2);
        boolean b = isPalindrome(head);
        System.out.println(b);
    }


    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // 找到一般的链表结构
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 反转一波链表，然后一个一个进行比对
        ListNode endNode = reserver(slow);

        while ( endNode.next != null) {
            if (head.val != endNode.val) {
                return false;
            }
            head = head.next;
            endNode = endNode.next;
        }
        return true;
    }

    public static ListNode reserver(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode node = reserver(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
