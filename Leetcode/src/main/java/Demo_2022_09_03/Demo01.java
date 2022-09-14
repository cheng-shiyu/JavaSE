package Demo_2022_09_03;

import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 * @author 程世玉
 * @data 2022/9/3.
 * 1、题目链接：<a href="https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述： 复杂链表的复制
 */
public class Demo01 {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {

    }

    /**
     * description: 首先要明白，问题在哪里，这个题的难点在哪里
     * 难点在于，我们如何是深层拷贝一波对象呢
     * 为什么要进行一个深层的拷贝，因为对象是引用类型，
     * 同时，存在一个随机指针，随机指针指向的对象可能在我们遍历到的时候还没有创建，那么肯定默认就引用到已经对象
     * @author: 程世玉
     * @Date: 2022/9/3
     */
    static HashMap<Node, Node> map = new HashMap<>();

    public static Node copyRandomList(Node head) throws FileNotFoundException {

        // 将所有的对象存入hash表中，同时创建对象
        if (head == null){
            return null;
        }

        if (!map.containsKey(head)){
            Node newHead = new Node(head.val);
            map.put(head,newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }

        return map.get(head);
    }

    public static void copy(Node head,Node myHead){
    }
}
