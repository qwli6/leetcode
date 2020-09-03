package com.qiwen.interview.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");

        System.out.println(list);

        list.add("9");
        list.add("10");
        list.add("11");

        System.out.println(list.get(0));


        List<String> list1 = new ArrayList<>(10);

        System.out.println(22 + (22 >> 1));
//        1010 == 0001010
    }
}
