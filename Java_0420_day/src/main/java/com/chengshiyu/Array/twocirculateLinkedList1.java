package com.chengshiyu.Array;

/**
 * @author 程世玉
 * @data 2022/4/22.
 * 双向循环链表  约瑟夫问题
 * 改良了remove方法，以及current、next
 *
 */
public class twocirculateLinkedList1<E> extends AbstractList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private Node<E> current;

    public twocirculateLinkedList1() {

    }

    /**
     * 重置
     */
    public void reset(){
        current = first;
    }

    /**
     * 指向下一节点
     * @return
     */
    public E next(){
        if (current == null){
            return null;
        }

        current = current.next;

        return current.element;
    }

    /**
     * 删除当前节点
     * 循环双向链表，需要考虑到如果仅仅剩下一个节点的时候，会出现current.next = current
     * 因为是循环链表，所以剩下最后一个，他自己指向自己，所以就会出现你删除了，但是你还有虚假数据的情况
     */
    public E remove(){
        if (current == null){
            return null;
        }
        Node<E> next = current.next;
        if (size == 1){
            System.out.println("约瑟夫最后值 = " + current.element);
            size=0;
            return current.element;
        }
        System.out.println("删除的节点 = " + current.element);
        remove(current);
        /*考虑到仅仅剩下一个节点的时候出现的自己指向自己的问题*/
        if (size == 0){
            current = null;
        }else {
            current = next;
        }
        return current.element;
    }


    /*这个是用户添加对象的时候*/
    private class Node<E> {
        Node<E> prev;
        E element;
        Node<E> next;

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

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

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
    }

    @Override
    public boolean contains(E a) {
        return false;
    }

    @Override
    public void add(E a) {
        add(size,a);
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

    /**
     * 新添加的节点
     * 循环链表
     */
    @Override
    public void add(int index, E a) {

      if (index == size){
          /*
          1、第一个元素，first和last都是null，一定经过这里
          2、那么每次进行添加之后，last应该怎么更新
           */
          // 获取到当前谁在最后一个oldlast
          Node<E> oldlast = this.last;
          // 创建到目前最后的元素信息
           last = new Node<>(oldlast, a, first);
          if (oldlast == null){
              first = last;
              /*自己指向自己*/
              first.next = first;
              first.prev = first;
          }else {
              oldlast.next = last;
              first.prev = last;
          }
      }else {
          // 获取当前元素，当前元素必定是要被添加元素的next
          Node<E> next = getIndexNode(index);
          // 获取当前元素的头元素，这个元素必定是要添加元素的prev
          Node<E> prev = next.prev;
          // 当前元素如下：
          Node<E> node = new Node<>(null, a, next);

          // 当前元素的前一个元素变成添加的元素
          next.prev = node;
          // 前面那个元素一定要指向后面的，之前处理他，涉及到第一个元素的prev.next是null，现在不存在这种情况，这个必须执行，从if中拿出来
          prev.next = node;
          /*循环链表，prev不存在为null的情况，之前是因为不是循环，所以第一个元素可以为null
          * 现在我们要判断是不是第一个元素，可以通过index==0或者==first*/
          if (next == first){
              first = node;
          }
//          else {
//              prev.next = node;
//          }
      }

      size++;
    }

    /**
     * 删除指定元素
     */
    @Override
    public void remove(int index) {
        Node<E> indexNode = getIndexNode(index);
        remove(indexNode);
    }

    private void remove(Node<E> current) {
        Node<E> indexNode = current;

        Node<E> next = indexNode.next;
        Node<E> prev = indexNode.prev;
        // 需要考虑头节点还有尾节点的情况,之所以出现这种情况，还是因为first仅仅就是一个变量，所以头节点的prev是null，而不是指向first
        if (size == 1){
            first = null;
            last = null;
            size--;
            return;
        }
        if (prev == first){
            first.next = next;
        }else {
            prev.next = next;
        }

        if (next == last){
            last.next = prev;
        }else {
            next.prev = prev;
        }
        size--;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    /**
     * 获取根据index获取指定节点信息
     */
    private Node<E> getIndexNode(int index) {
        /*如果小于一半，则从开头进行查询*/
        if (index < (size>>1)){
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }else {
            Node<E> node = this.last;
            for (int i = size-1; i > index;i--){
                node = node.prev;
            }
            return node;
        }

    }
}
