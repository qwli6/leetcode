package me.lqw.algorithm;

import java.util.Arrays;

/**
 * 选择排序
 * @author liqiwen
 * @since 2.2
 * @version 2.2
 *
 * {4,2,3,7,1}
 * 第一轮最小位置的索引为
 *
 *
 *
 *
 *
 */
public class SelectSortDemo {

    private static int[] nums = new int[]{4,2};

    public static void main(String[] args){

        selectSort(nums);

        for(int t: nums){
            System.out.println("排好序的数组为" + t);
        }

    }


    public static void selectSort(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        if(nums.length == 1){
            //一个元素的数组不需要排序，直接返回即可
            return ;
        }

        int minIndex = 0; // 最小值的索引位

        int position = 0;  // 标记已经排序好的元素位置

        while (true) {
            //遍历出最小的数值索引位
            for (int i = position; i < nums.length - 1; i++) {
                if (nums[minIndex] > nums[i + 1]) { //当前索引位的值大于下一个值的索引位
                    minIndex = i + 1; //将
                }
            }
            System.out.println("第" + position + "次循环最小位置的索引:" + minIndex);
            if(minIndex == position){
                position ++ ;
                minIndex = position;
                continue;
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[position];
            nums[position] = temp;
            position ++;
            minIndex = position;
            if(position == nums.length - 1){
                break;
            }
        }
    }
}
