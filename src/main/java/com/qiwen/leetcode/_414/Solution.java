package com.qiwen.leetcode._414;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * 414
 *
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int thirdMax(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        boolean flag = true;
        int index = 0; //新增一个索引位，标记是否有重复的
        for (int num : nums) {
            if (num == Integer.MIN_VALUE && flag) {
                index++;
                flag = false;
            }
            if (num > first) {
                index++;
                last = second; //中间的数值赋值给最小的
                second = first; //最大的赋值给第二大的
                first = num; //最后给最大的值赋值
            } else if (num > second && num < first) { //在第一和第二中间
                index++;
                last = second;
                second = num;
            } else if (num > last && num < second) { //在第二和第三中间
                index++;
                last = num;
            }
        }
        //索引位大于 3，则直接取最小的，如果 < 3，则说明有重复的数值，取最大的
        return index >= 3 ? last : first;
    }


    public static void main(String[] args){
        Solution solution = new Solution();
//        int[] nums = new int[]{1,3,2,4,7,7,9,8};
        int[] nums = new int[]{2,2,3,1};
//        int[] nums = new int[]{2,2,2,1};
        int i = solution.thirdMax(nums);
        System.out.println(i);
    }
}