package me.lqw.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class LeetCode26 {

    public static void main(String[] args){

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
//        int[] nums = new int[]{1,1,2};

        int i = removeDuplicates(nums);
        System.out.println(i);

//        System.out.println(nums.length);
    }

    public static int removeDuplicates(int[] nums) {

        if(nums == null || nums.length  == 0){
            return 0;
        }

        if(nums.length < 2){
            return nums.length;
        }


        int j = 0;
        int k = 1;

        for(int i = 0; i < nums.length-1; i++){
            if(k == nums.length){
                return j+1;
            }
            if(nums[j] == nums[k]){
                k++;
            } else if(nums[j] > nums[k]){
                return j+1;
            } else {
                j++;
                nums[j] = nums[k];
                k++;
            }
        }
        return j+1;


//        int j = 1;
//        //注意，不需要返回新数组，只需要返回长度
//        //前后两个比较就行了
//        for(int i = 0; i < nums.length-1; i++){
//            if(nums[i] != nums[i+1]){
//                j++;
//            }
//        }

//        Set<Integer> set = new HashSet<>(1);
//        int a = 0;
//        int j = 0;
//        for(int i = 0; i < nums.length; i++){
//            a = nums[j];
//            if(a == nums[i+1]){
//
//            }
//        }


    }
}
