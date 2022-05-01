package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 模拟栈，采用数组方式
 */
public class Stack1<E> implements Stack<E> {

    private int size;

    private E[] elements;

    private static final int DEFAULT_CAPACITY = 10;

    public Stack1() {
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

    // 就是往末尾添加数据
    @Override
    public void push(E element) {
        add(element);
    }

    // 弹出元素
    @Override
    public E pop() {
        return remove();
    }

    @Override
    public E top() {
        return get();
    }


    /*向数组中添加元素*/
    private void add(E element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    /*扩容操作，每次进行判断*/
    private void ensureCapacity() {
        int oldlen = elements.length;
        if (size > oldlen) {
            /*扩容0.75倍倍*/
            oldlen = oldlen >> 1 + oldlen;

            E[] nelements = (E[]) new Object[oldlen];

            for (int i = 0; i < size; i++) {
                nelements[i] = elements[i];
            }
            elements = nelements;
        }
    }

    /*去除操作*/
    private E remove() {
        int index = size - 1;

        E element = elements[index];

        elements[index] = null;
        size--;

        return element;
    }

    /*获取元素*/
    private E get() {
        return elements[size - 1];
    }
}
