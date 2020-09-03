package com.qiwen.interview.list;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){

//        Map<String, Object> map = new HashMap<>();
//        map.put("xx", "xx");
        Map<String, Object> map2 = new HashMap<>(32);
        map2.put("xx", "yy");

//        tableSizeFor(31);

    }


    static void tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n+1);
    }

}
