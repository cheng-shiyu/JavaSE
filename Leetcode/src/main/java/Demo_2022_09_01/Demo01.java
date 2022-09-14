package Demo_2022_09_01;

import java.util.*;

/**
 * @author 程世玉
 * @data 2022/9/1.
 * 1、题目链接：<a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：
 */
public class Demo01 {


    public static void main(String[] args) {
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static LinkedList<TreeNodeWrap> queue = new LinkedList<>();
    static ArrayList<List<Integer>> arr = new ArrayList<>();

    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("root不能为空");
            return arr;
        }
        TreeNodeWrap treeNodeWrap = new TreeNodeWrap(root, 1);

        queue.add(treeNodeWrap);

        print();

        Set<Integer> keySet = map.keySet();

        // 按照官方给出的提示创建合适的对象进行返回
        for (Integer integer : keySet) {
            ArrayList<Integer> list = map.get(integer);
            if (integer % 2 != 0){
                reserver(list);
            }
            arr.add(map.get(integer));
        }
        return arr;
    }

    /**
     * 打印
     */
    private static void print() {
        TreeNodeWrap wrap = queue.getFirst();
        TreeNode node = wrap.node;
        // 将每一层的数据存入map中
        addToMap(wrap);

        // 判出条件
        if (node.right != null) {
            queue.add(new TreeNodeWrap(node.right, wrap.level + 1));
        }
        if (node.left != null) {
            queue.add(new TreeNodeWrap(node.left, wrap.level + 1));
        }

        // 递归调用
        print();
    }


    private static void addToMap(TreeNodeWrap wrap) {
        int level = wrap.getLevel();

        TreeNode node = wrap.getNode();

        ArrayList<Integer> list = map.get(level);

        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(node.val);

        map.put(level, list);
    }

    private void reserver(ArrayList<Integer> list){
        int size = list.size();
        for (int i = 0,j = size - 1; i < j;i++,j--){
            Integer temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
    }

    static class TreeNodeWrap {
        /**
         * description: 本节点
         *
         * @author: 程世玉
         * @Date: 2022/9/1
         */
        TreeNode node;

        /**
         * description: 父节点的信息
         *
         * @author: 程世玉
         * @Date: 2022/9/1
         */
        int parentLevel;

        /**
         * description: 自己的层级
         *
         * @author: 程世玉
         * @Date: 2022/9/1
         */
        int level;

        public TreeNode getNode() {
            return node;
        }

        public void setNode(TreeNode node) {
            this.node = node;
        }

        public int getParentLevel() {
            return parentLevel;
        }

        public void setParentLevel(int parentLevel) {
            this.parentLevel = parentLevel;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public TreeNodeWrap(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

}
