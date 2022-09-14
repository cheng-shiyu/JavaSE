package Demo_2022_08_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 程世玉
 * @data 2022/8/27.
 * 1、题目链接：<a href="https://leetcode.cn/problems/all-nodes-distance-k-in-binary-tree/">...</a>
 * 2、题目描述：二叉树中所有距离为 K 的结点
 */
public class Demo01 {


    /**
     * description: 节点类
     *
     * @author: 程世玉
     * @Date: 2022/8/27
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * description: 题目意思大致明白，简单来说，就是让我返回某一个节点的最近的几个节点
     *
     * @author: 程世玉
     * @Date: 2022/8/27
     * 几个节点，然后找到她的几个
     */
    static Map<Integer, TreeNode> parents = new HashMap<Integer, TreeNode>();
   static List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 从 root 出发 DFS，记录每个结点的父结点
        findParents(root);

        // 从 target 出发 DFS，寻找所有深度为 k 的结点
        findAns(target, null, 0, k);

        return ans;
    }

    public void findParents(TreeNode node) {
        if (node.left != null) {
            parents.put(node.left.val, node);
            findParents(node.left);
        }
        if (node.right != null) {
            parents.put(node.right.val, node);
            findParents(node.right);
        }
    }

    public void findAns(TreeNode node, TreeNode from, int depth, int k) {
        if (node == null) {
            return;
        }
        if (depth == k) {
            ans.add(node.val);
            return;
        }
        // 遍历左子树，DFS深度遍历
        if (node.left != from) {
            findAns(node.left, node, depth + 1, k);
        }
        // 遍历右子树，DFS深度遍历
        if (node.right != from) {
            findAns(node.right, node, depth + 1, k);
        }
        // 开始遍历上子树
        if (parents.get(node.val) != from) {
            findAns(parents.get(node.val), node, depth + 1, k);
        }
    }


    public static void main(String[] args) {
    }

    /**
     * description:  按照人家的思路走一遍
     *
     * @author: 程世玉
     * @Date: 2022/8/27
     * 对于查询，满足一定的条件进行查询，其实使用DFS或者BFS最好，图的遍历
     * 树是特殊的图，我们其实也是可以将我们的树中使用DFS，或者BFS
     */
    public static List<Integer> distanceC(TreeNode root, TreeNode target, int k) {
        // 人家仅仅告诉我们根节点，我们目标节点的，目标节点的父节点我们是不知道的，但是我们要知道父节点，才能网上遍历，左右我们知道，所以我们可以往左右遍历

        // 1、得到目标节点的父节点
        findParents1(root);

        // 2、深度遍历，得到所有满足条件的结果
        // 目标节点，从那里开始，目前位置是多少，深度是多少
        findDFS(target,null,0,k);

        return ans;
    }


    /**
     * description: 这里递归的时候，都要传递一个父节点的信息，为什么呢？
     * 防止递归到本节点，确实存在，比如我们遍历本节点的父节点，然后左右遍历她的节点，她的父节点
     * 那么就存在，遍历她的时候，她左右节点，其实又递归回来，这个是一个细节问题
     * @author: 程世玉
     * @Date: 2022/8/28
     */
    private static void findDFS(TreeNode target, TreeNode from, int i, int k) {
        if (target == null){
            return;
        }
        if (i == k){
            ans.add(target.val);
            return;
        }

        // 左子树
        if (target.left != from){
            findDFS(target.left,target,i+1,k);
        }
        // 右子树
        if (target.right != from){
            findDFS(target.right,target,i+1,k);
        }

        // 上子树
        if (parents.get(target.val) != from){
            findDFS(parents.get(target.val),target,i+1,k);
        }

    }

    private static void findParents1(TreeNode root) {
        // 遍历所有的节点，得到他们的父节点，放入我们的map中
        if (root.left != null){
            parents.put(root.left.val,root);
            findParents1(root.left);
        }
        if (root.right != null){
            parents.put(root.right.val,root);
            findParents1(root.right);
        }
    }
}
