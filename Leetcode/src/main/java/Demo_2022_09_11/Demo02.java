package Demo_2022_09_11;

import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @data 2022/9/11.
 * 1、题目链接：<a href="https://leetcode.cn/problems/validate-ip-address/">...</a>
 * 2、题目描述：验证IP地址
 */
public class Demo02 {
    public String validIPAddress(String queryIP) {
       return Pattern.matches(
               "^(((25[0-5])|(2[0-4][0-9])|(1[0-9][0-9])|([1-9][0-9])|([0-9]))[.]){3}((25[0-5])|(2[0-4][0-9])|(1[0-9][0-9])|([1-9][0-9])|([0-9]))$", queryIP) ? "IPv4" : (Pattern.matches("^([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})$", queryIP) ? "IPv6" : "Neither");
    }
}
