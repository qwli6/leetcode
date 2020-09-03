package com.qiwen.interview.list;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 手写 ArrayList
 */
public class SimpleArrayList {


    /**
     * SimpleArrayList 的默认容量
     */
    private static final Integer DEFAULT_CAPACITY = 10;


    /**
     * SimpleList 存放对象的数组
     */
    private Object[] objectsArray = {};


    /**
     * 当前 ObjectsArray 里面的元素个数
     */
    private int size;


    /**
     * 不带容量的构造方法
     */
    public SimpleArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 带容量的构造方法
     * @param capacity capacity
     */
    public SimpleArrayList(int capacity){
        if(capacity < 0 || capacity > Integer.MAX_VALUE-8){
            throw new IllegalArgumentException("无效的容量参数");
        }
        objectsArray = new Object[capacity];
    }

    /**
     * 添加元素
     * @param object object
     * @return true| false
     */
    public boolean add(Object object){
        //实际数组长度
        int objectsArraysLength = objectsArray.length;
        //期望容量
        int expectCapacity = size + 1;
        System.out.println("期望容量: " + expectCapacity + ". 实际数组容量: " + objectsArraysLength);
        if(expectCapacity > objectsArraysLength){
            int newCapacity = objectsArraysLength * 2; // 把旧数组的长度 * 2 作为扩容量

            System.out.println("计划扩容数量: " + newCapacity);
            if(expectCapacity > newCapacity) {
                newCapacity = expectCapacity;
            }

            if(newCapacity > Integer.MAX_VALUE-8){
                newCapacity = Integer.MAX_VALUE-8;
            }
//            Object src,  int  srcPos,
//            Object dest, int destPos,
//            int length

            objectsArray = Arrays.copyOf(objectsArray, newCapacity);

//            Object[] targetObject = new Object[newCapacity];
//            System.arraycopy(objectsArray,0, targetObject, objectsArraysLength-1, objectsArraysLength);
//            objectsArray = targetObject;
        }

        objectsArray[size++] = object;

        return true;
    }


    public Object get(int index){
        if(index < 0 || index > Integer.MAX_VALUE){
            throw new IllegalArgumentException("非法索引参数");
        }

        if(index+1 > size){
            throw new IndexOutOfBoundsException("索引越界异常");
        }

        return objectsArray[index];
    }


    /**
     * 获取集合的大小
     * @return size
     */
    public int size(){

        return size;
    }



    @Override
    public String toString() {
        return Arrays.toString(objectsArray);
    }
}
