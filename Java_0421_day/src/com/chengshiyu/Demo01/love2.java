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
public class love2 {
    /**
     * 通过打折，计算出来打完折扣之后应该多少前
     * @param customType
     * @return
     */
    public BigDecimal quote(BigDecimal originalPrice, String customType){
        if ("新客户".equals(customType)) {
            return this.quoteNewCustomer(originalPrice);
        }else if ("老客户".equals(customType)) {
            return this.quoteOldCustomer(originalPrice);
        }else if("VIP客户".equals(customType)){
            return this.quoteVIPCustomer(originalPrice);
        }
        //其他人员都是原价
        return originalPrice;
    }

    /**
     * 对VIP客户的报价算法
     * @param originalPrice 原价
     * @return 折后价
     */
    private BigDecimal quoteVIPCustomer(BigDecimal originalPrice) {
        System.out.println("恭喜！VIP客户打8折");
        originalPrice = originalPrice.multiply(new BigDecimal(0.8)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }

    /**
     * 对老客户的报价算法
     * @param originalPrice 原价
     * @return 折后价
     */
    private BigDecimal quoteOldCustomer(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户打9折");
        originalPrice = originalPrice.multiply(new BigDecimal(0.9)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }

    /**
     * 对新客户的报价算法
     * @param originalPrice 原价
     * @return 折后价
     */
    private BigDecimal quoteNewCustomer(BigDecimal originalPrice) {
        System.out.println("抱歉！新客户没有折扣！");
        return originalPrice;
    }

    @Test
    public void t1(){
        love2 love1 = new love2();
        BigDecimal quote = love1.quote(new BigDecimal("180"),"老客户");
        System.out.println(quote);
    }
}
