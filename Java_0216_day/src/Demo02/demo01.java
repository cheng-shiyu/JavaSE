package Demo02;

/**
 * @author 程世玉
 * @create 2022/3/28 7:58
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class demo01<T> {

    /*泛型方法*/
    public T aaa(T t){
        return t;
    }


    public <T extends Comparable<T>> void bbb(T t){
    }

    public <t extends  Comparable<t>> t ccc(t t){
        return t;
    }

    public void ddd(Comparable<? super T> comparable){

    }

}
