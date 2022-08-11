package Demo_2022_05_07;

import java.util.HashSet;

/**
 * @author 程世玉
 * @data 2022/5/7.
 * 题目链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 无重复字符的最长子串
 *
 */
public class love2 {

//    /*采用队列的方式*/
//    public int lengthOfLongestSubstring(String s) {
//        Queue<Character> set = new LinkedList<>();
//        char[] chars = s.toCharArray();
//        int maxLen = 0;
//        int right = 0;
//        while (right < s.length()){
//            while (set.contains(chars[right])){
//                set.remove();
//            }
//            set.add(chars[right++]);
//            maxLen = Math.max(maxLen,set.size());
//        }
//        return maxLen;
//    }


/*采用链表的方式*/
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < s.length()){
            while (set.contains(chars[right])){
                set.remove(chars[left++]);
            }
            set.add(chars[right++]);
            maxLen = Math.max(maxLen, set.size());
        }
        return maxLen;
    }
}
