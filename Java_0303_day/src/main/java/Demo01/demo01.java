package Demo01;

import com.chengshiyu.Pojo1.Father;
import com.chengshiyu.Pojo1.Method;
import com.chengshiyu.Pojo1.Son1;
import com.chengshiyu.Pojo1.Son2;

/**
 * @author 程世玉
 * @create 2022/3/3 10:07
 * @PROJECT_NAME JavaSE
 * @Description 继承
 *
 */
public class demo01 {
    public static void main(String[] args) {
        Son1[] son1s = new Son1[2];
        Son2[] son2s = new Son2[2];
        Father[] f = new Father[5];

        /*son1*/
        Son1 s1 = new Son1("程世玉",3);
        Son1 s2 = new Son1("程世玉",3);
        son1s[0] = s1;
        son1s[1] = s2;

//        /*son2*/
        Son2 s3 = new Son2("程世玉",3);
        Son2 s4 = new Son2("程世玉",4);

        son2s[0] = s3;
        son2s[1] = s4;

        Method.method1(son2s);

        Method.method1(son1s);
    }
}
