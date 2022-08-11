package Demo_2022_08_02;

/**
 * @author 程世玉
 * @data 2022/5/20.
 * 题目链接：<a href="https://leetcode.cn/problems/number-of-digit-one/">...</a>
 * 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
 * 这道题暂时解决不出来，太难了
 */
public class Demo01 {
    public static void main(String[] args) {
        int i = countDigitOne(12);
        System.out.println(i);
    }

    /**
     * description:
     * @author: 程世玉.
     * 1、统计谁出现的次数，我一个一个统计不好统计，我个位统计，十位统计，一个一个统计，这样的效率相对来说还是比较搞的
     * 2039
     * 要统计个位出现的次数，统计十位出现的次数，统计百位出现的次数之类的， 总而言之，一个一个统计就行
     * 怎么统计呢？
     * 统计个位出现的次数，怎么统计呢
     * 一个十内，就出现1次，一个百内，就出现10，一个一千以内就出现100次，总而言之，这个个位是受每一位的影响，进行计算即可
     * 十位的话，100以内1次，200以内的话，20，1000以内呢，
     *
     */
    public static int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
}
