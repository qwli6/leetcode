package me.lqw.algorithm;

/**
 *
 * 二分查找算法
 * <p>
 *     <li>数组必须有序</li>
 * </p>
 *
 * @author liqiwen
 * @version 2.0
 */
public class BinarySearchDemo {


    private static int[] target = new int[]{-1};

    private static int startIndex;
    private static int endIndex;


    public static void main(String[] args){

        int index = middleSearch(target, 9);
        System.out.println();

    }


    public static int middleSearch(int[] target, int value){
        if(target == null){
            return -1;
        }

        int middleIndex;
        int startIndex = 0;
        int endIndex = target.length-1;
        do {
            middleIndex = (startIndex+endIndex)/2;
            if(target[middleIndex] == value){
                return middleIndex;
            } else if(target[middleIndex] > value){
                //中间索引位的值大于给定的值，调整 endIndex
                endIndex = middleIndex -1;
            } else if(target[middleIndex] < value){
                startIndex = middleIndex + 1;
            }
            System.out.println("中间索引位：" + middleIndex + "||  开始索引位：" + startIndex + "   ||   结束索引位：" + endIndex);
        } while (startIndex <= endIndex); //直到 startIndex > endIndex 为止
        return -1;
    }

}
