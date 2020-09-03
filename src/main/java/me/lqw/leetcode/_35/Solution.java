package com.qiwen.leetcode._35;

import java.awt.*;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    /**
     * 这个题目默认了数组是正序，理论上来说，他只给了排序数组，没有说是正序还是倒序，应该分两种情况考虑
     * @param nums nums
     * @param target target
     * @return index
     */
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        boolean flag = nums[1] > nums[0]; //因为是有序列表，正序和倒序的处理方式是不同的
        if(flag){
            if(target < nums[0]){
                return 0;
            }
        } else {
            if(nums[nums.length-1] < target){
                return nums.length;
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] == target) { //相等就直接返回索引
                return i;
            }

            if (flag) {

                if (nums[nums.length - 1] < target) { //正序，判断最后一位数是否比目标值小
                    return nums.length; //如果小，直接返回数组长度
                }

                if (nums[i] < target && nums[i + 1] > target) { //相邻的两个数比较
                    index = i + 1;
                    return index;
                } else {
                    index = nums.length + 1;
                }

            } else {
                if (nums[nums.length - 1] > target) { //倒序，判断最后一位是否比目标值大
                    return nums.length;
                }

                if (nums[i] > target && nums[i + 1] < target) {
                    index = i + 1;
                    return index;
                } else {
                    index = nums.length + 1;
                }
            }
        }

        return index;

    }

    /**
     * 只考虑正序
     * @param nums nums
     * @param target target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums[0] > target){
            return 0;
        }

        if (nums[nums.length - 1] < target) { //正序，判断最后一位数是否比目标值小
            return nums.length; //如果小，直接返回数组长度
        }
        if(nums[nums.length -1] == target){ //考虑边界情况
            return nums.length-1;
        }

        int index = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == target){
                return i;
            }
            if ((nums[i] < target && nums[i+1] > target)) { //相邻的两个数比较
                return i+1;
            }
        }

        return index;

    }


    public static void main(String[] args){

        int[] nums = new int[]{1,3};
//        int[] nums = new int[]{6,5,3,1};

        Solution solution = new Solution();
        int i = solution.searchInsert2(nums, 3);
        System.out.println(i);

    }
}