package com.chengshiyu.Demo05;

public class t1 {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("lies","北京时间9.05分");
        hashMap.put("foes","北京时间9.34分");
        hashMap.put("程世玉3","北京时间9.05分");
        hashMap.put("程世玉4","北京时间9.05分");
        Object o = hashMap.get("foes");
        System.out.println(o);


    }
}
