package com.qiwen.interview.list;

public class CustomArrayListDemo {


    public static void main(String[] args){




        SimpleArrayList simpleArrayList = new SimpleArrayList();

        for(int i = 0; i < 100; i++){
            boolean add = simpleArrayList.add(i);
        }


        System.out.println(simpleArrayList.toString());

        System.out.println("当前集合的 size：" + simpleArrayList.size());


        System.out.println(simpleArrayList.get(3));


    }
}

