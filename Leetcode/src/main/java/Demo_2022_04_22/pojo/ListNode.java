package Demo_2022_04_22.pojo;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public class ListNode{
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}