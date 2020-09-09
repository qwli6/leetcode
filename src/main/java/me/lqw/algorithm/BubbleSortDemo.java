package me.lqw.algorithm;

import java.util.Arrays;

/**
 * 简单的冒泡排序
 * @author liqiwen
 * @since 1.0
 */
public class BubbleSortDemo {


    private static int[] nums = new int[]{2,3,9,7,5,6,12,10,43, 32};

    public static void main(String[] args){

        int[] ints = bubbleSortEnhance(nums);
        System.out.println("排序完毕之后的结果:" + Arrays.toString(ints));

    }


    public static int[] bubbleSort(int[] nums){

        if(nums == null || nums.length == 1){
            return nums;
        }

        //用来标记是否已经排序完成
        boolean finish;

        while (true){
            //每次循环将该值改成 true
            finish = true;

            for(int i = 0; i < nums.length-1; i++){
                int temp;
                if(nums[i] > nums[i+1]) { //如果已经是有序的了，则不会进入该该判断
                    finish = false;
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            System.out.println("排序结果: " + Arrays.toString(nums));
            if(finish){
                break;
            }
        }
        return nums;

    }


    public static int[] bubbleSortEnhance(int[] nums){
        if(nums == null || nums.length == 1){
            return nums;
        }
        //用来标记是否已经排序完成
        boolean finish;

        //指针，初始为数组最后的索引位
        int pointIndex = nums.length-1;

        while (true){
            //每次循环将该值改成 true
            finish = true;
            System.out.println("本轮该排序的索引位为 [0, " + pointIndex + "]");
            for(int i = 0; i < pointIndex; i++){
                int temp;
                if(nums[i] > nums[i+1]) { //如果已经是有序的了，则不会进入该该判断
                    finish = false;
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            //执行一次，就会有一个元素排好序，然后将 pointIndex--，避免已经排好序的元素进入下一轮的循环
            pointIndex--;
            System.out.println("排序结果: " + Arrays.toString(nums));
            if(finish){
                break;
            }
        }
        return nums;
    }

}
