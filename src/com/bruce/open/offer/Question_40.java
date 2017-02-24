package com.bruce.open.offer;


/**
 * Created by qizhenghao on 17/2/24.
 *
 * 题目:一个整型数组里除了两个数字之外,其他的数字都出现了两次。
 * 请写程序 找出这两个只出现一次的数字。要求时间复杂度是 O(n),空间复杂度为 O(1)
 */
public class Question_40 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 4, 4, 5, 6, 6, 5};
        System.out.println(findNumsAppearOnce(arr));
    }

    public static int findNumsAppearOnce(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }

}
