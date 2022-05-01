package Demo_2022_04_22;

import Demo_2022_04_22.pojo.ListNode;

/**
 * @author 程世玉
 * @data 2022/4/22.
 * 输入 head=【4,5,1,9】 , node = 1
 * 输出【4，5，9】
 * 解释：给定一个链表中的值为1的第三个节点，那么在调用完函数之后，该链表应该为4，5，9
 */
public class Demo01 {

    public void deleteNode(ListNode node){
      node.val =  node.next.val;
      node.next = node.next.next;
    }
}
