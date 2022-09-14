package Demo_2022_08_31;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author 程世玉
 * @data 2022/8/31.
 * 1、题目链接：<a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述： 从上到下打印二叉树
 */
public class Demo04 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * description: 从上到下打印二叉树
     * @author: 程世玉
     * @Date: 2022/8/31
     */
   static LinkedList<TreeNode> queue = new LinkedList<>();
   static ArrayList<Integer> arr = new ArrayList<>();
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        queue.add(root);
        arr.add(root.val);
        a();
        int[] ints = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            ints[i] = arr.get(i);
        }
        return ints;
    }
    public void a(){
        if (queue.size() == 0){
            return;
        }
        TreeNode root = queue.removeFirst();
        if (root.left != null){
            queue.add(root.left);
            arr.add(root.left.val);
        }
        if (root.left != null){
            queue.add(root.right);
            arr.add(root.right.val);
        }
        a();
    }

}
