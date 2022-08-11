package Demo_2022_05_08;

/**
 * @author 程世玉
 * @data 2022/5/8.
 * 题目链接：https://leetcode-cn.com/problems/zigzag-conversion/
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 */
public class love2 {
    public String convert(String s, int numRows) {
        StringBuffer sb = new StringBuffer();
        int num = numRows * 2 - 2;
        if (numRows == 1){
            return s;
        }
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < s.length(); j++){
                if (j % num == i || j % num == num - i){
                    sb.append(s.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}
