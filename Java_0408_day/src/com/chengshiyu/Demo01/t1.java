package com.chengshiyu.Demo01;

public class t1 {
    public static void main(String[] args) {
        /*单链表*/
        Node header = new Node(null, null);

        Node node1 = new Node("第一个元素", null);
        header.setNext(node1);

        Node node2 = new Node("第二个元素", null);
        node1.setNext(node2);

        Node node3 = new Node("第三个元素", null);
        node2.setNext(node3);
        // 通过这个，确实到了，时间复杂度确实是非常地，O1 只需要改变俩就行
        Node node4 = new Node("第四个元素，插队到第一个元素后面", node2);
        node1.setNext(node4);

        System.out.println(header);


    }
}
