package com.chengshiyu.Array;

/**
 * @author 程世玉
 * @data 2022/4/20.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>{
    /*不需要编写了，可以从父类中读取*/
//    private int size;

    // 存放元素的数组
    private E[] elements;

    // 初始容量  默认是16个长度
    private static final int DEFAULT_CAPATICY = 2;


    /*如果没有指定默认创建多大，那就默认长度*/
    public ArrayList() {
        this(DEFAULT_CAPATICY);
    }
    /*如果指定默认创建多大，我们就需要进行判断长度*/
    public ArrayList(int size){
        if (size > 0) {
            elements = (E[]) new Object[size];
        } else if (size == 0){
            elements = (E[]) new Object[DEFAULT_CAPATICY];
        }else {
            throw new IllegalArgumentException("创建数组失败，你传入的值为负数，请重新操作！！传入的值为 = " + size);
        }
    }

    /**
     * 添加元素
     */
    @Override
    public void add(E a) {
        ensureCapacity(size);
        elements[size++] =  a;
    }

    /*清空元素，直接让size为0即可，效率也是蛮高的*/
    @Override
    public void clear() {

        /*涉及到后面的元素，如果存放的对象，数组里面存放的是对象地址，这里不能直接设置为0，负责对象一直没有被清除*/
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }

        size = 0;
    }









    /**
     * 通过下标获取元素
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组越界，符合我的喜欢，你这程序猿我喜欢😄");
        }
        return elements[index];
    }

    /**
     * 是否包含这个元素
     */
    @Override
    public boolean contains(E a) {
        return indexOf(a) != DEFAULT_CAPATICY;
    }
    /**
     * 替换指定下标的数据，并将数据返回
     */
    @Override
    public Object set(int index, E a) {
        isindexNull(index,size);
        /*获取到老的数据*/
        Object old = elements[index];
        /*将新的数据添加其中*/
        elements[index] = a;
        return old;
    }

    /**
     * 添加指定位置下的元素元素
     */
    @Override
    public void add(int index, E a) {
        // 5 4 3 2 1 0
        ensureCapacity(size);

        for (int i = size-1 ; i >= index; i--){
            elements[i+1] = elements[i];
        }
        elements[index] = a;
        size++;
    }

    /**
     * 去除元素
     */
    @Override
    public void remove(int index) {
        /*删除元素，就涉及到，怎么处理元素的移动，这也就是数组增删慢的原因*/
        /*此刻涉及到了对象的清除，所以我们要考虑最后一个元素的值应为null*/
        for (int i = index; i < size-1; i++){
            elements[i] = elements[i+1];
        }
        /*7 --- 》 6*/
        size--;
        /*6 如果正常应该是size-1，但是这个凑巧，就直接size*/
        elements[size] = null;
    }

    /**
     * 查看元素的索引值
     * 要求对象必须重写equal方法
     */
    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < elements.length; i++){
            if (elements[i].equals(element)){
                return i;
            }
        }
        return 0;
    }



    // 下面这种方式，效率低，因为size-1，需要进行运算

//    @Override
//    public String toString() {
//
//        // size = 10,list{1,2,3}
//
//        StringBuffer s = new StringBuffer();
//        s.append("size = " + size + ",list{");
//
//        // 这种方式，效率比较低
//        for (int i = 0; i < size; i++){
////            if (i != size-1){
////                s.append(elements[i] + ",");
////            }else{
////                s.append(elements[i] + "}");
////            }
//        }
//        return s.toString();
//    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("size = ").append(size).append(",list{");
        // 这种方式，效率比较低
        for (int i = 0; i < size; i++){
            if (i != 0){
                s.append(",");
            }
            s.append(elements[i].toString());
        }
        s.append("}");
        return s.toString();
    }


    /**
     * 扩容操作
     */
    public void ensureCapacity(int capacity){
        /*一般扩容一点五倍*/
        int oldcapacity = elements.length;
        if (oldcapacity > capacity){
            return;
        }
        /*扩容一旦五倍*/
        int newcapacity =oldcapacity+ (oldcapacity >> 1);

        E[] newElements = (E[]) new Object[newcapacity];

        for (int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
        System.out.println("扩容后容量 = " + newElements.length);
    }
}
