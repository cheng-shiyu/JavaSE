package Demo_2022_09_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 程世玉
 * @data 2022/9/5.
 * 1、题目链接：<a href="https://leetcode.cn/problems/zi-fu-chuan-de-pai-lie-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：字符串的排列
 */
public class Demo01 {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("s");
        str.add("b");
    }

   static List<List<Character>> res = new ArrayList<>();



    /**
     * description: 该解决方案，没有解决实际问题，还是存在重复的现象
     * @author: 程世玉
     * @Date: 2022/9/5
     */
    public static String[] permutation(String s) {
        char[] array = s.toCharArray();

        LinkedList<Character> list = new LinkedList<>();

        backtrack(array,list);

        String[] str = new String[res.size()];

        for (int i = 0; i < res.size();i++){
            List<Character> characterList = res.get(i);
            StringBuffer sb = new StringBuffer();
            for (Character character : characterList) {
                sb.append(character);
            }
            str[i] = sb.toString();
        }

        return str;
    }

    /**
     * description: 从上到下来回的遍历我们所有的节点信息
     * @author: 程世玉
     * @Date: 2022/9/5
     */
    private static void backtrack(char[] array, LinkedList<Character> list) {
        // 如果已经到达叶子节点，那么就退回，重新开始新的节点查询
        if (list.size() == array.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < array.length; i++){
            // 排除一些不合法的选择
            if (list.contains(array[i])) continue;

            // 开始添加入我们集合中
            list.add(array[i]);

            // 开始下一个遍历
            backtrack(array,list);

            // 开始回溯,将退回到我们最开始的模样
            list.removeLast();
        }
    }



}
