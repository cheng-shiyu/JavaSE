package com.chengshiyu.Demo01;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author 程世玉
 * @data 2022/4/21.
 * + 新客户不打折扣
 * + 针对老客户打9折
 * + 针对VIP客户打8折
 */
public class love1 {
    /**
     * 通过打折，计算出来打完折扣之后应该多少前
     * @param customType
     * @param originPrice
     * @return
     */
    public BigDecimal quote(String customType, BigDecimal originPrice){
        if ("新客户".equals(customType)){
            System.out.println("抱歉，新用户没有折扣");
            return originPrice;
        }else if ("老客户".equals(customType)){
            System.out.println("老顾客打9折");
            BigDecimal newPrice = originPrice.multiply(new BigDecimal(String.valueOf(1.2)));
            return newPrice;
        }else if ("vip".equals(customType)){
            System.out.println("vip顾客打8折");
            BigDecimal newPrice = originPrice.multiply(new BigDecimal("0.8"));
            return newPrice;
        }
        /*其余任何人员，都是原价*/
        return originPrice;
    }


    @Test
    public void t1(){
        love1 love1 = new love1();
        BigDecimal quote = love1.quote("老客户", new BigDecimal("180"));
        System.out.println(quote);
    }
}
