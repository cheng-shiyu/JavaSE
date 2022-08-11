package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @data 2022/5/4.
 *
 */
public interface BinarySearchTree<E> {
    /*判断是否为空*/
    boolean isEmpty();

    /*清空所有*/
    void clear();

    /*添加元素*/
    void add(E element);


    /*删除元素*/
    int remove(E element);


    /*是否包含某个元素*/
    boolean contains(E element);



}
