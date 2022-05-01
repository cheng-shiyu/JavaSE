package com.chengshiyu.Array;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public abstract  class AbstractList<E> implements List<E>{

    protected int size;

    /**
     * 集合长度
     */
    @Override
    public int size() {
        return size;
    }


    /**
     * 是否是为空
     */
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    public static void isindexNull(int index,int size){
        if (index < 0 || index >= size ){
            throw new IndexOutOfBoundsException("数组越界，符合我的喜欢，你这程序猿我喜欢😄");
        }
    }

}
