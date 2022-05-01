package Demo01;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 测试栈
 */
public class love1 {
    @Test
    public void t1() {
        Stack1<Integer> stack1 = new Stack1<>();
        stack1.push(1);
        stack1.push(2);

        stack1.push(3);

        System.out.println(stack1.pop());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("是否开始模拟浏览器前进与倒退:");
        String line = scanner.nextLine();
        Stack1<String> stack1 = new Stack1<>();
        Stack1<String> stack2 = new Stack1<>();
        String nextLine = null;
        while ("是".equals(line)){
            /*输入网址*/
            System.out.print("请输入网址：");
            nextLine = scanner.nextLine();
            stack1.push(nextLine);
            System.out.print("回退请输入1，前进请输入0，否则输入2:");
            nextLine = scanner.nextLine();
            if ("1".equals(nextLine)){
                if (stack1.isEmpty()){
                    System.out.println("栈为空，无法进行回退");
                    continue;
                }
                /*1则是进行回退，回退的话，我们就需要将原本的值传入到另一个栈中*/
                String top = stack1.top();
                stack2.push(top);
                stack1.pop();
            }
            if ("0".equals(nextLine)){
                if (stack2.isEmpty()){
                    System.out.println("没有数据，无法前进");
                    continue;
                }
                /*2则是进行前进，将stack2中的值放入stack1中*/
                String top = stack2.top();
                stack1.push(top);
                stack2.pop();
            }
            if ("break".equals(nextLine)){
                break;
            }
        }

        for (int i = 0; i < stack1.size();i++){
            String pop = stack1.pop();
            System.out.println("剩余元素：" + pop);
        }
    }


}
