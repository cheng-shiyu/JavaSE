package com.chengshiyu.Array;

/**
 * @author 程世玉
 * @data 2022/4/20.
 * 自定义list集合
 */
public interface List<T> {
    void clear();

    int size();

    boolean isEmpty();

    boolean contains(T a);


    void add(T a);

    T get(int a);

    Object set(int index, T a);

    void add(int index, T a);

    void remove(int index);

    int indexOf(Object element);
}
