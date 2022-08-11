package Demo_2022_08_04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 程世玉
 * @data 2022/8/5.
 * 1、题目链接：<a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">...</a>
 * 2、给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Demo02 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }


    /**
     * description: 滑动窗口的方式解决
     * @author: 程世玉.
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> queue = new ArrayList<>();
        String m = null;
        int max = 0;
        for (int i = 0; i < chars.length; i++){
            char aChar = chars[i];

            flag(queue,aChar);

            queue.add(aChar);

            if (max < queue.size()){
                max = queue.size();
            }
        }

        return max;
    }

    public static void flag(List<Character> list,Character character){
        if (!list.contains(character)){
            return;
        }
        list.remove(0);
        flag(list,character);
    }
}
