package Demo_2022_09_07;

/**
 * @author 程世玉
 * @data 2022/9/7.
 * 1、题目链接：<a href="https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：重建二叉树
 */
public class Demo02 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * description: 重建树
     * @author: 程世玉
     * @Date: 2022/9/7
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 根节点
        int r = preorder[0];
        TreeNode root = new TreeNode(r);

        // 2、根据根节点，找到其对应的子节点
        return null;
    }

    private void buid(int[] preorder, int[] inorder,TreeNode root){
        for (int node : inorder) {

        }
    }


}
