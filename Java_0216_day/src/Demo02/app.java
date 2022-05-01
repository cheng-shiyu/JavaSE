package Demo02;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author 程世玉
 * @create 2022/3/30 9:34
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class app {


    /**
     * <p>
     * 主程序
     *
     * @author XiaoPengwei
     * @since 2019-06-18
     */

    public static void main(String[] args) throws Exception {

        // 第一步：获取 LL(1)文法
        ArrayList<String> gsArray = new ArrayList<String>();
        Grammar grammar = new Grammar();

        //初始化 LL(1), 设定该文法的产生式
        initGs(gsArray);

        grammar.setGsArray(gsArray);
        grammar.getNvNt();
        grammar.initExpressionMaps();
        grammar.getFirst();

        // 设置开始符
        grammar.setS('E');
        grammar.getFollow();
        grammar.getSelect();

        //打印预测分析表, 并保存文件
        grammar.genAnalyzeTable();

        // 创建一个分析器
        Analyzer analyzer = new Analyzer();

        // 设定开始符号
        analyzer.setStartChar('E');
        analyzer.setLl1Grammar(grammar);

        // 待分析的字符串
        analyzer.setStr("i+i*i#");

        // 执行分析, 打印分析步骤, 保存文件
        analyzer.analyze();

    }

    /**
     * 获取非终结符集与终结符集
     *
     * @param gsArray
     * @param nvSet
     * @param ntSet
     */
    private static void getNvNt(ArrayList<String> gsArray, TreeSet<Character> nvSet, TreeSet<Character> ntSet) {
        for (String gsItem : gsArray) {
            String[] nvNtItem = gsItem.split("->");
            String charItemStr = nvNtItem[0];
            char charItem = charItemStr.charAt(0);
            // nv在左边
            nvSet.add(charItem);
        }
        for (String gsItem : gsArray) {
            String[] nvNtItem = gsItem.split("->");
            // nt在右边
            String nvItemStr = nvNtItem[1];
            // 遍历每一个字
            for (int i = 0; i < nvItemStr.length(); i++) {
                char charItem = nvItemStr.charAt(i);
                if (!nvSet.contains(charItem)) {
                    ntSet.add(charItem);
                }
            }
        }

    }

    /**
     * 初始化 LL(1)文法, 设定产生式
     *
     * @param gsArray
     */
    private static void initGs(ArrayList<String> gsArray) {
        //E' = M
        //T' = N
        gsArray.add("E->TM");
        gsArray.add("M->+TF");
        gsArray.add("M->ε");
        gsArray.add("T->FN");
        gsArray.add("N->*FN");
        gsArray.add("N->ε");
        gsArray.add("F->(E)");
        gsArray.add("F->i");
    }


}
