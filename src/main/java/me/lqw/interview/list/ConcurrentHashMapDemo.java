package com.qiwen.interview.list;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    private static void main(String[] args){

        Map<String, String> map = new ConcurrentHashMap<>();

        map.put("111", "222");


        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("222", "333");

    }
}
