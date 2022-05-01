package Demo_2022_04_22;

import Demo_2022_04_22.pojo.ListNode;

/**
 * @author 程世玉
 * @data 2022/4/22.
 * 检验一个链表中是否存在环
 * 赛跑，只要有环，那就一定是一个圈，只要是圈，那么无论是一次走两步的还是一次走一步的
 * 最终都会在这个环里面，最终相遇
 * 误区：1、一次跑两步，他也是head.next.next 等于说也是一步一步的走，不会出现遇见环跳过去的情况
 *      2、如果不是环，最终他们next都会是null，因为一条道走到黑
 *      3、如果是环，则会循环绕圈
 */
public class Demo03 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            if (fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
