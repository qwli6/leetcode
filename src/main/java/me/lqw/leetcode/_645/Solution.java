package com.qiwen.leetcode._645;

import java.util.*;

/**
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，
 * 导致集合丢失了一个整数并且有一个元素重复。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,2,4]
 * 输出: [2,3]
 * 注意:
 *
 * 给定数组的长度范围是 [2, 10000]。
 * 给定的数组是无序的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/set-mismatch
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] temp = new int[nums.length+1];
        for(int num : nums) {
            temp[num] ++;
        }

        for(int i = 1; i < temp.length; i++){
            if(temp[i] == 1) {
                continue;
            }
            if(temp[i] == 2) {
                result[0] = i;
            } else {
                result[1] = i;
            }
        }
        return result;

    }


    public static void main(String[] args){

//        int[] nums = {1,2,3,4,5,6,6,8};
        int[] nums = {3,3,4,6,5,2};

        Solution solution = new Solution();
        int[] errorNums = solution.findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));

    }
}