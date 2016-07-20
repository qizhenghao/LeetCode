package com.bruce.open.easy;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/7/20.
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement {

    public static void main(String[] args) {
//
//        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3) + "");
//        System.out.println(removeElement(new int[]{3, 2, 3}, 3) + "");
//        System.out.println(removeElement(new int[]{3}, 3) + "");
//        System.out.println(removeElement(new int[]{3, 3}, 5) + "");
//        System.out.println(removeElement(new int[]{}, 3) + "");
//        System.out.println(removeElement(new int[]{2}, 3) + "");
//        System.out.println(removeElement(new int[]{4, 5}, 4) + "");
        System.out.println(removeElement1(new int[]{2, 2, 3}, 2) + "");
        System.out.println(removeElement1(new int[]{1, 2, 3, 4}, 1) + "");
    }

    //效率高
    private static int removeElement1(int[] nums, int val) {
        int startIndex = 0, endIndex = nums.length;
        while (endIndex > startIndex) {
            if (nums[startIndex] == val) {
                nums[startIndex] = nums[endIndex - 1];
                endIndex--;
            } else
                startIndex++;
        }
        return endIndex;
    }


    //效率低,但容易理解
    private static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0] == val ? 0 : 1;
        int count = 0;
        Arrays.sort(nums);
        int startIndex = -1, endIndex = -1;
        for (int i = 0; i < nums.length && endIndex == -1; i++) {
            if (val == nums[i] && startIndex == -1) {
                startIndex = i;
            } else if (val != nums[i] && startIndex != -1) {
                endIndex = i;
                count = endIndex - startIndex;
            }
        }
        if (startIndex == -1)
            return nums.length;
        if (endIndex == -1)
            return startIndex;
        int length = nums.length - startIndex - 1;
        for (int i = 0; i < length && endIndex < nums.length; i++) {
            nums[startIndex++] = nums[endIndex++];
        }
        return nums.length - count;
    }
}
