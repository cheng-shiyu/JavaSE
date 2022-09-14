package Demo_2022_09_01;

import java.util.HashMap;

/**
 * @author 程世玉
 * @data 2022/9/1.
 * 1、题目链接：<a href="https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述： 树的子结构
 */
public class Demo03 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * description: 将我们所有的
     *
     * @author: 程世玉
     * @Date: 2022/9/1
     */

    static HashMap<Integer, TreeNode> map = new HashMap<>();

    static public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null){
            return false;
        }

        // 将所有的节点放入我们的hashMap中
        saveToMap(A);

        TreeNode node = map.get(B.val);

        if (node == null) {
            return false;
        }

        // 开始遍历树，判断是否是子序列
        return flag(node, B);

    }

    static private void saveToMap(TreeNode A) {
        if (A == null) {
            return;
        }
        map.put(A.val, A);
        saveToMap(A.left);
        saveToMap(A.right);
    }


    static private boolean flag(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }

        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }

        return flag(A.left, B.left) && flag(A.right, B.right);
    }
}
