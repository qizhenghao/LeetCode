package com.bruce.open.easy;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/7/14.
 */
public class MoveZeros {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 0, 3, 0, 0, 0, 0, 4, 0, 5};
//        int[] array = new int[]{1, 0};
//        int[] array = new int[]{1, 0, 0};
        System.out.println(Arrays.toString(moveZeros(array)) + "");
    }

    static int[] moveZeros(int[] nums) {

//        int index = nums.length - 1;
//        for (int i = 0; i < index; i++) {
//            if (nums[i] == 0) {
//                while (index > i && nums[index] == 0) {
//                    index--;
//                }
//                for (int j = i; j < index; j++) {
//                    nums[j] = nums[j+1];
//                }
//                nums[index] = 0;
//                i--;
//            }
//        }
//        return nums;

        if (nums == null || nums.length == 0)
            return nums;
        int count = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[count] = n;
                count++;
            }
        }
        for (; count < nums.length; count++) {
            nums[count] = 0;
        }

        return nums;
    }
}
