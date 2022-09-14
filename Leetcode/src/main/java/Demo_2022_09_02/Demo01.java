package Demo_2022_09_02;

/**
 * @author 程世玉
 * @data 2022/9/2.
 * 1、题目链接：<a href="https://leetcode.cn/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：二叉搜索树的后序遍历序列
 */
public class Demo01 {


    public boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        if (len == 0|| len == 1){
            return true;
        }
        // 二叉树搜索树，左边的一定都比根节点小，右边都比根节点大，根节点一定是在最后
        int root = postorder[len - 1];

        // 找到大于根节点的
        boolean flag = false;
        for (int i = 0; i < len - 2; i++){
            if (postorder[i + 1] > postorder[i] && postorder[i - 1] < postorder[i]){
                return false;
            }
            if (postorder[i] > root){
                flag = true;
            }
            if (flag){
                if (postorder[i] < root) {
                    return false;
                }
            }
        }
        return true;
    }
}
