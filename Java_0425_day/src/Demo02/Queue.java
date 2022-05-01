package Demo02;

/**
 * @author 程世玉
 * @data 2022/4/25.
 */
public interface Queue<E> {
    int size();

    boolean isEmpty();

    /**
     * 入队
     */
    void offer(E element);

    /**
     * 出队
     */
    E poll();

    /**
     * 返回首元素
     */
    E peek();



}
