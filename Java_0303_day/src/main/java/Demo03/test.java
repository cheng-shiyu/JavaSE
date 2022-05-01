package Demo03;

/**
 * @author 程世玉
 * @create 2022/3/30 19:57
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class test {
    public static void main(String[] args) throws Exception {

        // 存放在二维码中的内容
        String text = "你若不离不弃，我必生死相依,宝贝，爱你！！！";
        // 嵌入二维码的图片路径
        String imgPath = "C:\\Users\\程世玉\\Desktop\\a.jpg";
        // 生成的二维码的路径及名称
        String destPath = "C:\\Users\\程世玉\\Desktop\\b.png";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);

        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);


    }
}
