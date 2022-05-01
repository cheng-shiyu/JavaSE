package Demo02;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 循环队列
 * 底层采用数组实现
 */
public class CircleQueue<E> implements Queue<E>{
    /*队首的下标*/
    private int font;

    private int size;

    private E[] elements;

    private static final int DEFAULT_CAPACITY = 10;

    public CircleQueue() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向队列中添加元素
     * 1、如果到了最后怎么办，font怎么处理
     * 2、如果数组到了极限，但是前面仍然有位置，这个位置又是如何进行计算的？
     */
    @Override
    public void offer(E element) {
        /*获取队列最后的元素，可能在数组前面，可能在数组后面，一切皆有可能*/
        int index = (font + size) % elements.length;
        elements[index] = element;
        size++;
        ensureCapacity();
    }

    /**
     * 出队，队首出去
     * 0 1 2 3 4 5
     *     2 3 4 5 0
     */
    @Override
    public E poll() {
        E current = elements[font];
        elements[font] = null;
        font = (font + 1) % elements.length;
        size--;
        ensureCapacity();
        return current;
    }

    /**
     * 返回队首
     */
    @Override
    public E peek() {
        return elements[font];
    }


    /*动态扩容操作*/
    public void ensureCapacity(){
        if (size < elements.length){
            return;
        }
        // 扩容1.5倍
        int nlen = elements.length + (elements.length >> 1);


        E[] ele = (E[]) new Object[nlen];

        for (int i = 0; i < size;i++){
            ele[i] = elements[(i + font) % elements.length];
        }
        elements = ele;
        font = 0;
        System.out.println("扩容1.5倍，capacity = " + elements.length);
    }
}

