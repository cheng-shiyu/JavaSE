package Demo_2022_04_25;

import java.util.Stack;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 题目链接：https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * 实现 MyQueue 类：
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 */
public class Demo02 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.push(1);
        demo02.push(2);

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            /*出队的话，先将stack1所用东西放入到stack2中*/
            for (int i = 0; i < stack1.size(); i++) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
    }

    /**
     * 获取对头元素
     */
    public int peek() {
        if (stack2.isEmpty()) {
            for (int i = 0; i < stack1.size(); i++) {
                stack2.push(stack1.pop());
            }
        }
        // 下面这个方法，是获取栈中的顶层元素，也就是栈中最后进入的那个元素，他是最顶层的元素
        return stack2.peek();
    }

    public boolean empty() {
        /*只要这俩栈任意一个不为空，说明队列中还是又元素的*/
        return stack2.size() != 0 || stack1.size() != 0;
    }
}
