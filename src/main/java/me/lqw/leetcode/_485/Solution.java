package com.qiwen.leetcode._485;


import java.awt.*;
import java.util.Arrays;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length <= 0 || nums.length > 10000) {
            return 0;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if (num == 1) {
                a = a + 1;
                if (a > b) {
                    b = a;
                }
            } else if(num == 0) {
                if (a > b) {
                    b = a;
                } else {
                    a = 0;
                }
            } else {

                return 0;
            }
        }
        return b;
    }
}
