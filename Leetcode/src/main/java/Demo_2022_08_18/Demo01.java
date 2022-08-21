package Demo_2022_08_18;

import java.util.List;

/**
 * @author 程世玉
 * @data 2022/8/18.
 * 1、题目链接：<a href="https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/">...</a>
 * 2、题目描述：给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * 叶子节点 是指没有子节点的节点。
 */
public class Demo01 {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


      /**
       * description: 一定要用递归，深度优先算法，广度优先算法，
       * @author: 程世玉.
       */
    public static List<List<Integer>> pathSum(TreeNode root, int target) {

    }
}
