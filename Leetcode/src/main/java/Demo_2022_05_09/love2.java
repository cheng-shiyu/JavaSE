package Demo_2022_05_09;

import java.util.LinkedList;

/**
 * @author 程世玉
 * @data 2022/5/9.
 * 复习： 题目链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 */
public class love2 {
    public static void main(String[] args) {
        int abcded = lengthOfLongestSubstring("abcded");
        System.out.println(abcded);
    }
    /*采用滑动块的方式来解决这个问题*/
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int right = 0;
        int max = 0;
        LinkedList<Character> list = new LinkedList<>();
        while (right < chars.length){
            while (list.contains(chars[right])){
                list.removeFirst();
            }
            list.add(chars[right]);
            right++;
            max = Math.max(max,list.size());
        }
        return max;
    }
}
