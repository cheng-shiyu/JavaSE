package Demo02;

/**
 * @author 程世玉
 * @create 2022/3/30 9:33
 * @PROJECT_NAME JavaSE
 * @Description
 */

import java.io.Serializable;

/**
 * <p>
 * 分析过程 Bean
 *
 * @author XiaoPengwei
 * @since 2019-06-18
 */
public class AnalyzeProduce implements Serializable {
    private static final long serialVersionUID = 10L;
    private Integer index;
    private String analyzeStackStr;
    private String str;
    private String useExpStr;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getAnalyzeStackStr() {
        return analyzeStackStr;
    }

    public void setAnalyzeStackStr(String analyzeStackStr) {
        this.analyzeStackStr = analyzeStackStr;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getUseExpStr() {
        return useExpStr;
    }

    public void setUseExpStr(String useExpStr) {
        this.useExpStr = useExpStr;
    }

}
