package com.chengshiyu.Array;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public class LinkedList<E> extends AbstractList<E> implements List<E> {

    private Node<E> first;

    public LinkedList() {

    }


    /*这个是用户添加对象的时候*/
    private class Node<E> {
        E element;
        Node<E> next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E a) {
        return false;
    }

    @Override
    public void add(E a) {
        add(size,a);
//        /*从0开始进行插入,则需要配置first，因为first开始默认是null*/
//        /*获取前一个元素*/
//        Node<E> prev = getIndexNode(size - 1);
//        /*让他指向他，接着之前的再指向之前的*/
//        prev.next = new Node<>(a, prev.next);
//        size++;
    }

    @Override
    public E get(int a) {
        Node<E> node = getIndexNode(a);
        return node.getElement();
    }

    @Override
    public Object set(int index, E a) {
        return null;
    }

    @Override
    public void add(int index, E a) {
        /*从0开始进行插入,则需要配置first，因为first开始默认是null*/
        if (index == 0) {
            /*first是之前的第一个元素，之前的第一个元素*/
            first = new Node<>(a, first);
        } else {
            /*获取前一个元素*/
            Node<E> prev = getIndexNode(index - 1);
            /*让他指向他，接着之前的再指向之前的*/
            prev.next = new Node<>(a, prev.next);
        }
        size++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    /**
     * 获取根据index获取指定节点信息
     */
    private Node<E> getIndexNode(int index) {
//        isindexNull(index, size);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
