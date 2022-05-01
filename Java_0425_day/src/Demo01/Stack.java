package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 模拟栈
 */
public interface Stack<E> {
    // 元素的数量
    int size();

    // 是否是空
    boolean isEmpty();

    // 入栈
    void push(E element);

    // 出栈
    E pop();

    // 获取栈顶元素
    E top();

}
