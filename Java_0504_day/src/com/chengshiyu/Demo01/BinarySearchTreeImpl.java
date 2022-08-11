package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @data 2022/5/4.
 */
public class BinarySearchTreeImpl<E> implements  BinarySearchTree<E> {
    /*元素大小*/
    int size;
    /*根节点*/
    private Node<E> root;

    private static class Node<E>{
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;
        /*父节点一定要有*/
        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }
    }

    /*判断传入节点是否为null*/
    public boolean elementNotNullcheck(E element){
        if (element == null){
            throw new RuntimeException("新增节点不能为null");
        }
        return true;
    }


    /*两个对象比较，如果是0则是相同，如果是1则是前面比后面大，如果是-1则说明后面比前面大*/
    public int compare(E e1,E e2){
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(E element) {
        /*添加第一个节点*/
        if (root == null){
           root = new Node<E>(element,null);
           size++;
           return;
        }

        /*添加其他节点*/
        /*找到父节点*/
        Node<E> parent = null;
        Node<E> node = this.root;
        int cmp = compare(element, node.element);
        if (cmp > 0){
            node = root.left;
        }else if (cmp < 0){
            node = root.right;
        }else {
            return;
        }





    }

    @Override
    public int remove(E element) {
        return 0;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }
}
