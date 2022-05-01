package Demo_2022_04_29;

import java.util.LinkedList;

/**
 * @author 程世玉
 * @data 2022/4/29.
 * 题目链接：https://leetcode-cn.com/problems/simplify-path/
 * 给你一个字符串 path ，表示指向某一文件或目录的 Unix 风格
 * 绝对路径 （以 '/' 开头），请你将其转化为更加简洁的规范路径。
 * 在 Unix 风格的文件系统中，一个点（.）
 * 表示当前目录本身；此外，两个点 （..）
 * 表示将目录切换到上一级（指向父目录）；
 * 两者都可以是复杂相对路径的组成部分。
 * 任意多个连续的斜杠（即，'//'）都被视为单个斜杠
 * '/' 。 对于此问题，任何其他
 * 格式的点（例如，'...'）均被视为文件/目录名称。
 * <p>
 * <p>
 * 采用栈来解决这个问题
 */
public class Demo01 {
    public static void main(String[] args) {
//        String path = ".../Demo/01//01/19/20";
        String path = "/a/./b/../../c/";

        System.out.println(simplifyPath(path));
    }


    /**
     * 思路：
     * /demo/01
     * /demo/01/
     * ./demo/01
     * 不管咋，先一个一个的给分开
     *
     * @param path
     * @return
     */
    public static String simplifyPath(String path) {
        LinkedList<String> list = new LinkedList<>();
        StringBuffer a = new StringBuffer();
        String[] split = path.split("/");
        /**
         * 1、  .. 回退
         * 2、  .  / 过滤掉
         * 3、  保留
         */
        for (int i = 0; i < split.length; i++) {
            /*只要是这俩，直接过滤掉就行，最后同一加 / 即可*/
            if (split[i].equals("") || split[i].equals(".")) {
                continue;
            }
            /*如果是 .. 就需要进行倒退*/
            if (split[i].equals("..")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                }
                /*否则就不进行处理它*/
                continue;
            }
            list.add(split[i]);
        }
        for (String s : list) {
            a.append("/").append(s);
        }
        if (a.isEmpty()) {
            a.append("/");
        }
        return a.toString();

    }
}
